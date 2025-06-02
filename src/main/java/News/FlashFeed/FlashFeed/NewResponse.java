package News.FlashFeed.FlashFeed;

import lombok.Data;

import java.util.List;

@Data
public class NewResponse {
    private String status;
    private List<Resources> sources;
}
