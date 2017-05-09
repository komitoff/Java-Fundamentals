package main;

import model.Quote;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject(
                "https://gturnquist-quoters.cfapps.io/api/random", Quote.class
        );
    }
}
