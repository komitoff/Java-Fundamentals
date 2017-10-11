package lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Count = " + numbers.length);
        System.out.println("Sum = " + sum);
    }
}
