package main;

import model.Participant;
import model.Quote;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;

@SpringBootApplication
public class App {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Bean
    public RestTemplate restTemplate (RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
                Participant participant = restTemplate.getForObject(
                "http://api.football-data.org/v1/competitions/427/teams", Participant.class);
                log.info(participant.toString());
        };
    }
}
