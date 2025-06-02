package News.FlashFeed.FlashFeed;

import lombok.Data;

import java.util.Date;

@Data
public class Articles {

    private Source source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private Date publishedAt;
    private String content;

}
