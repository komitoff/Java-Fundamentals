package lab;

import java.util.Arrays;
import java.util.Scanner;

public class FindAndSumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = Arrays.stream(in.nextLine().split("\\s+"))
                .filter(x -> !x.isEmpty())
                .filter(x -> isInteger(x)).mapToInt(Integer::valueOf).toArray();
        print(numbers);
    }

    private static void print(int[] numbers) {
        if (numbers.length != 0) {
            System.out.println(Arrays.stream(numbers).sum());
        } else {
            System.out.println("No match");
        }
    }

    private static boolean isInteger(String s) {
        return isInteger(s, 10);
    }

    private static boolean isInteger(String s, int radix) {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {
                if (s.length() == 1) return false;
                else continue;
            }
            if (Character.digit(s.charAt(i), radix) < 0) return false;
        }
        return true;
    }
}
