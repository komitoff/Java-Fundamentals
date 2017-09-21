package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class OddEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (numbers.length % 2 != 0) {
            System.out.println("invalid length");
        } else {
            for (int i = 0; i < numbers.length; i+=2) {
                if (numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0) {
                    System.out.println(String.format("%d, %d -> both are even", numbers[i], numbers[i+1]));
                }
                else if (numbers[i] % 2 != 0 && numbers[i + 1] % 2 != 0) {
                    System.out.println(String.format("%d, %d -> both are odd", numbers[i], numbers[i+1]));
                }
                else {
                    System.out.println(String.format("%d, %d -> different", numbers[i], numbers[i+1]));
                }
            }
        }
    }
}
