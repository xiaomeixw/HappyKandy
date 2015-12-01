package sabria.happykandy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;

import sabria.happykandy.library.FrescoManager;

public class MainActivity extends AppCompatActivity {

    private final static String url1 = "http://file.xdf.cn/allimg/120411/99-1204111H449125.jpg";
    private final static String url2 = "http://album.sina.com.cn/pic/4aed36dd02000k86";
    private final static String url3 = "http://s15.sinaimg.cn/bmiddle/4ce9178eh6485c57df15e";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SimpleDraweeView sDVImage1= (SimpleDraweeView) findViewById(R.id.sDVImage1);
        SimpleDraweeView sDVImage2= (SimpleDraweeView) findViewById(R.id.sDVImage2);
        SimpleDraweeView sDVImage3= (SimpleDraweeView) findViewById(R.id.sDVImage3);
        FrescoManager.load(url1).into(sDVImage1);
        FrescoManager.load(url2).into(sDVImage2);
        FrescoManager.load(url3).into(sDVImage3);
    }


}
