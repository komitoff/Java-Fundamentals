package last_digit_name;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] digitNames = new String[] {
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"
        };

        int input = scanner.nextInt();
        System.out.println(digitNames[input%10]);
    }
}
