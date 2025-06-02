package News.FlashFeed.FlashFeed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlashFeedApplication {

	private static final Logger log = LoggerFactory.getLogger(FlashFeedApplication.class);

	public static void main(String[] args) {
		log.info("Hey I am here!");
		SpringApplication.run(FlashFeedApplication.class, args);
	}

}
