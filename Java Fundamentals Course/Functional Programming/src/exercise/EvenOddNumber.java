package exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String cmd = scanner.nextLine();

        Predicate<Integer> isEven = x -> x % 2 == 0;

        for (int i = numbers[0]; i <= numbers[1]; i++) {
            if (cmd.equalsIgnoreCase("odd")) {
                if (!isEven.test(i)) {
                    System.out.print(i);
                    System.out.print(" ");
                }
            } else {

                if (isEven.test(i)) {
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
        }
    }
}
