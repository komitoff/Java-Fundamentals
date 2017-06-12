package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    //private static final org.slf4j.Logger log = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

//    @Bean
//    public RestTemplate restTemplate (RestTemplateBuilder builder) {
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//                Participant participant = restTemplate.getForObject(
//                "http://api.football-data.org/v1/competitions/427/teams", Participant.class);
//                log.info(participant.toString());
//        };
//    }
}
