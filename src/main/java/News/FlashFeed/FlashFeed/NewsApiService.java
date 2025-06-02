package News.FlashFeed.FlashFeed;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.json.simple.JSONObject;

@Service
@Slf4j
public class NewsApiService {

    @Value("${news.api.key}")
    private String apiKey;

    @Value("${NEWS_BASE_URL}")
    private String NEWS_BASE_URL;
    public String getTopHeadlines(String country) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<NewResponse> response = restTemplate.getForEntity(getTopHeadlineURL(country), NewResponse.class);

        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                // Convert the object to a Map or JSON string as needed
                String jsonString = mapper.writeValueAsString(response.getBody());
                return jsonString;
            } catch (Exception e) {
                e.printStackTrace();
                return "Error parsing response body.";
            }
        } else {
            return "Failed to fetch data";
        }
    }
    private String getTopHeadlineURL(String country) {
//        https://newsapi.org/v2/top-headlines/sources?apiKey=API_KEY
        String url =  NEWS_BASE_URL + "/top-headlines/sources?apiKey=" + apiKey;
        log.info(url);
        return url;
    }
}
