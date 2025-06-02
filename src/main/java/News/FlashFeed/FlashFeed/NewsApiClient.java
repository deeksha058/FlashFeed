package News.FlashFeed.FlashFeed;

public class NewsApiClient {
    private final String apiKey;

    public NewsApiClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public void getEverything(String query, ArticlesResponseCallback callback) {
        // Fake sample to demonstrate call — use actual logic or an HTTP client
        try {
            // Simulate successful API call
            ArticleResponse response = new ArticleResponse(); // Build mock or real response
            callback.onSuccess(response);
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    public interface ArticlesResponseCallback {
        void onSuccess(ArticleResponse response);
        void onFailure(Throwable throwable);
    }
}

