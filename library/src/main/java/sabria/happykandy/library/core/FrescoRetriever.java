package sabria.happykandy.library.core;

/**
 * Created by xiongwei,An Android project Engineer.
 * Date:2015-08-14  14:56
 * Base on Meilimei.com (PHP Service)
 * Describe:
 * Version:1.0
 * Open source
 */
public class FrescoRetriever {

    private static final FrescoRetriever instance = new FrescoRetriever();

    private volatile FrescoCreator frescoCreator;

    public static FrescoRetriever get() {
        return instance;
    }

    public FrescoCreator get(String url) {
        return getFrescoUrl(url);
    }

    private FrescoCreator getFrescoUrl(String url) {
        return new FrescoCreator(url);
    }

}
