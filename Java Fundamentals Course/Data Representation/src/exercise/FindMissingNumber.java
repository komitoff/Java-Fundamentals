package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int missingNumber = findMissingNumber(count, numbers);
        System.out.println(missingNumber);
    }

    private static int findMissingNumber(int count, int[] numbers) {
        int[] sorted = Arrays.stream(numbers).sorted().toArray();

        for (int i = 0; i < count - 1; i++) {
            if (i+1 != sorted[i]) {
                return i+1;
            }
        }

        return sorted[sorted.length-1] + 1;
    }
}
