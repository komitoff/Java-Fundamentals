package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String cmd = scanner.nextLine();

        while (!cmd.equalsIgnoreCase("end")) {
            switch (cmd) {
                case "add" :
                    numbers = Arrays.stream(numbers).map(x -> x + 1).toArray();
                    break;
                case "multiply" :
                    numbers = Arrays.stream(numbers).map(x -> x * 2).toArray();
                    break;
                case "subtract" :
                    numbers = Arrays.stream(numbers).map(x -> x - 1).toArray();
                    break;
                case "print" :
                    break;
            }
            cmd = scanner.nextLine();
        }
        Arrays.stream(numbers).forEach(x -> System.out.print(x + " "));
    }
}
