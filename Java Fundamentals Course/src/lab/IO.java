package lab;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        String thirdWord = scanner.next();
        System.out.println(String.format("%s %s %s %d",
                firstWord, secondWord, thirdWord, firstNumber + secondNumber + thirdNumber));
    }
}
