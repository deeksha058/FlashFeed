package News.FlashFeed.FlashFeed;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @Autowired
    NewsApiService newsApiService;
    @RequestMapping(value = "/getTopHeadlines", method = RequestMethod.GET)
    public String getTopHeadLines(){
        return newsApiService.getTopHeadlines("in");
    }
}
