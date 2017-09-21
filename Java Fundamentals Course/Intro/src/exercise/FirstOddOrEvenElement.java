package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FirstOddOrEvenElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] cmdTokens = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(cmdTokens[1]);
        if (cmdTokens[2].equalsIgnoreCase("even")) {
            int[] res = Arrays.stream(arr)
                    .filter(x -> x % 2 == 0)
                    .limit(count)
                    .toArray();
            Arrays.stream(res).forEach(x -> System.out.print(x + " "));
        } else if (cmdTokens[2].equalsIgnoreCase("odd")) {
            int[] res = Arrays.stream(arr)
                    .filter(x -> x % 2 != 0)
                    .limit(count)
                    .toArray();
            Arrays.stream(res).forEach(x -> System.out.print(x + " "));
        }
    }
}
