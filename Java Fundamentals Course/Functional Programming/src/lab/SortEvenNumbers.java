package lab;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(x -> x % 2 != 0);
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        Consumer<String> print =
                x -> System.out.println(x.substring(1, x.length() - 1));

        print.accept(numbers.toString());
        print.accept(sorted.toString());
    }
}
