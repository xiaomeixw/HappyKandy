package sabria.happykandy.library.core;

import android.net.Uri;
import android.support.annotation.NonNull;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

import sabria.happykandy.library.R;


/**
 * Created by xiongwei,An Android project Engineer.
 * Date:2015-08-14  14:56
 * Base on Meilimei.com (PHP Service)
 * Describe:
 * Version:1.0
 * Open source
 */
public class FrescoCreator {

    /**
     * Http or File Url，must begin with http:// or file://
     */
    private String mUrl;
    /**The image control*/
    //private SimpleDraweeView mImageView;
    /**
     * Aspect ratio
     */
    private float mRatio = 0.0f;
    /**
     * whether show gif
     */
    private boolean mGif = false;
    /**
     * whether set JPEG Progressive shows
     */
    private boolean mProJpeg = false;
    /**
     * whether set crop
     */
    private boolean mCenterCrop = false;
    /**
     * whether  set  Aspect ratio
     */
    private boolean mRsize = false;

    /**
     * fail image
     */
    private int mErrorImg = R.drawable.base_image_backgroud;
    /**
     * holder image
     */
    private int mPlaceholder = R.drawable.base_image_backgroud;
    /**
     * fail image
     */
    private int mFailImg = R.drawable.base_image_backgroud;

    private int mWidth;
    private int mHeight;


    /**
     * constructor
     *
     * @param url
     */
    FrescoCreator(String url) {
        this.mUrl = url;
    }


    /**
     * if your set wrap_content in xml , should use this method Specify the wide / high percentage
     * @param ratio
     * @return
     */
    public FrescoCreator setAspectRatio(float ratio) {
        this.mRatio = ratio;
        return this;
    }

    /**
     * set gif show true
     * @return
     */
    public FrescoCreator setGifTrue() {
        this.mGif = true;
        return this;
    }

    /**
     * set jpeg Progressive shows
     *
     * @return
     */
    public FrescoCreator setProgressiveJPEGTrue() {
        this.mProJpeg = true;
        return this;
    }

    /**
     * set holder image
     *
     * @param drawable
     * @return
     */
    public FrescoCreator placeholder(int drawable) {
        this.mPlaceholder = drawable;
        return this;
    }

    /**
     * set fail image
     *
     * @param drawable
     * @return
     */
    public FrescoCreator fail(int drawable) {
        this.mFailImg = drawable;
        return this;
    }


    /**
     * set error image
     *
     * @param drawable
     * @return
     */
    public FrescoCreator error(int drawable) {
        this.mErrorImg = drawable;
        return this;
    }

    /**
     * set crop
     *
     * @return
     */
    public FrescoCreator centerCrop() {
        this.mCenterCrop = true;
        return this;
    }


    public FrescoCreator resize(int width, int height) {
        this.mRsize = true;
        this.mWidth = width;
        this.mHeight = height;
        return this;
    }


    /**
     * set image show
     *
     * @param imageView must com.facebook.drawee.view.SimpleDraweeView
     */
    public void into(SimpleDraweeView imageView) {
        Uri uri = getCommonUri(imageView);
        if (!mGif) {

            if (mRsize) {


                ImageRequest request = ImageRequestBuilder.newBuilderWithSource(uri)
                        .setResizeOptions(new ResizeOptions(mWidth, mHeight))
                        .build();
                DraweeController controller = Fresco.newDraweeControllerBuilder()
                        .setImageRequest(request)
                        .build();
                imageView.setController(controller);


            } else {
                imageView.setImageURI(uri);
            }


        } else {
            DraweeController controller = getGifController(imageView, uri);
            imageView.setController(controller);
        }

    }


    /**
     * when gif download it will auto run , meanwhile when view remove from screen ,stop gif paly
     *
     * @param imageView
     * @param uri
     * @return
     */
    private DraweeController getGifController(SimpleDraweeView imageView, Uri uri) {
        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(uri)
                .build();
        return Fresco.newDraweeControllerBuilder()
                .setImageRequest(request)
                .setAutoPlayAnimations(true)
                .setOldController(imageView.getController())//use old controller,save memory
                .build();
    }


    /**
     * set  basic parameters
     *
     * @param imageView
     * @return
     */
    @NonNull
    private Uri getCommonUri(SimpleDraweeView imageView) {

        Uri uri = Uri.parse(mUrl);
        if (mRatio != 0.0f) {
            imageView.setAspectRatio(mRatio);
        }
        return uri;
    }


}
