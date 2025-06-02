package News.FlashFeed.FlashFeed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService {

    private final NewsApiClient newsApiClient;

    @Autowired
    public NewsService(NewsApiClient newsApiClient) {
        this.newsApiClient = newsApiClient;
    }

    public void fetchNews() {
        newsApiClient.getEverything("trump", new NewsApiClient.ArticlesResponseCallback() {
            @Override
            public void onSuccess(ArticleResponse response) {
                System.out.println("Title: " + response.getArticles().get(0).getTitle());
            }

            @Override
            public void onFailure(Throwable throwable) {
                System.out.println("Error: " + throwable.getMessage());
            }
        });
    }
}
