package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int smallets = Arrays.stream(numbers).min().getAsInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[numbers.length - i - 1] == smallets) {
                System.out.println(numbers.length - i - 1);
                break;
            }
        }
    }
}
