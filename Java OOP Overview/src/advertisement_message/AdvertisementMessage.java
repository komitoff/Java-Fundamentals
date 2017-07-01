package advertisement_message;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer msg = new StringBuffer();

        String[] phrases = new String[]{
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };

        String[] evenets = new String[] {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };

        String[] authors = new String[] {
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };

        String[] cities = new String[] {
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        };

        int numberOfMessages = scanner.nextInt();

        for (int i = 0; i < numberOfMessages; i++) {
            msg.append(phrases[randomGenerator(phrases.length)]);
            msg.append(" ");
            msg.append(evenets[randomGenerator(evenets.length)]);
            msg.append(" ");
            msg.append(authors[randomGenerator(authors.length)]);
            msg.append(" - ");
            msg.append(cities[randomGenerator(cities.length)]);
            System.out.println(msg.toString());
            msg.delete(0, msg.length());
        }
    }

    public static int randomGenerator(int count) {
        Random rand = new Random();
        int output = rand.nextInt(count);
        return output;
    }
}
