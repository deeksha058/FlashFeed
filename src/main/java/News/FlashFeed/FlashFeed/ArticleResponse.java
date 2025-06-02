package News.FlashFeed.FlashFeed;

import lombok.Data;

import javax.lang.model.element.NestingKind;
import java.util.List;

@Data
public class ArticleResponse {

    private List<Articles> articles;
    private long totalResults;
    private String status;
}
