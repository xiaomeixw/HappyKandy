package sabria.happykandy.library;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import sabria.happykandy.library.core.FrescoCreator;
import sabria.happykandy.library.core.FrescoRetriever;


/**
 * Created by xiongwei,An Android project Engineer.
 * Date:2015-08-14  12:27
 * Base on Meilimei.com (PHP Service)
 * Describe:   FrescoManager.load(url).into(imageview);
 * Version:1.0
 * Open source
 */
public class FrescoManager {


    /**
     * Initialize Fresco in Application
     */
    public  static void initFresco(Application application){
        Fresco.initialize(application);
    }


    /**
     * Fresco not support relative path,should Absolute path need URI's scheme like "http://" or "file://"
     * @param url  (web_image)            http://
     *             (local_image)            file://
     *             (Content provider)   content://
     *             (asset_image)   asset://
     *             (res_iamge)     res://package/R.drawable.ic_launcher
     * @return
     */
    public static FrescoCreator load(String url){

        FrescoRetriever retriever = FrescoRetriever.get();
        return retriever.get(url);
    }








}
