package sabria.happykandy;

import android.app.Application;

import sabria.happykandy.library.FrescoManager;

/**
 * Created by xiongwei,An Android project Engineer.
 * Date:2015-12-01  18:07
 * Base on Meilimei.com (PHP Service)
 * Describe:
 * Version:1.0
 * Open source
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initFresco(this);
    }

    private void initFresco(MyApplication myApplication) {
        FrescoManager.initFresco(myApplication);
    }
}
