package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = reader.readLine().split("\\s+");
        List<Character> letters = Arrays.stream(reader.readLine().split("\\s+"))
                .map(x -> x.toLowerCase().charAt(0))
                .collect(Collectors.toList());

        Optional<String> first = Arrays.stream(names)
                .filter(x -> letters.contains(x.toLowerCase().charAt(0)))
                .sorted((x, y) -> x.compareTo(y))
                .findFirst();

        if (first.isPresent()) {
            System.out.println(first.get());
        } else {
            System.out.println("No match");
        }
    }
}
