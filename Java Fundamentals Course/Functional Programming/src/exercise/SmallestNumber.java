package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(Arrays.stream(numbers).min().getAsInt());
    }
}
