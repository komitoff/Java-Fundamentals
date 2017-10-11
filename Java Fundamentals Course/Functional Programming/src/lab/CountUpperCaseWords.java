package lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        Predicate<String> wordChecker = x -> x.charAt(0) != x.toUpperCase().charAt(0);
        words.removeIf(wordChecker);
        System.out.println(words.size());
        words.forEach(System.out::println);
    }
}
