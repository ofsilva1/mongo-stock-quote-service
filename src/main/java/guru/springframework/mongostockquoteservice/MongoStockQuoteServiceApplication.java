package guru.springframework.mongostockquoteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// docker run -d --name sfg-mongo -p 27017:27017 mongo

@SpringBootApplication
public class MongoStockQuoteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoStockQuoteServiceApplication.class, args);
	}

}
