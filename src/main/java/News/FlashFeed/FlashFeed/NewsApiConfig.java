package News.FlashFeed.FlashFeed;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class NewsApiConfig {

    @Value("${news.api.key}")
    private String apiKey;

    @Bean
    public NewsApiClient newsApiClient() {
        return new NewsApiClient(apiKey);
    }

}
