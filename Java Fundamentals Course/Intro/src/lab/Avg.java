package lab;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        System.out.println(String.format("%.2f",
                (firstNumber + secondNumber + thirdNumber) / 3));
    }
}
