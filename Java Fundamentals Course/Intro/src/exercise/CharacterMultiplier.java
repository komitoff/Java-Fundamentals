package exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();
        int totalSum = 0;

        if (first.length() >= second.length()) {
            for (int i = 0; i < second.length(); i++) {
                totalSum += (int)first.charAt(i) * second.charAt(i);
            }
            for (int i = second.length(); i < first.length(); i++) {
                totalSum += first.charAt(i);
            }
        } else if (first.length() < second.length()) {
            for (int i = 0; i < first.length(); i++) {
                totalSum += (int)first.charAt(i) * second.charAt(i);
            }
            for (int i = first.length(); i < second.length(); i++) {
                totalSum += second.charAt(i);
            }
        }

        System.out.println(totalSum);
    }
}
