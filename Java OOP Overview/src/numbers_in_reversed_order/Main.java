package numbers_in_reversed_order;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        DecimalNumber decimalNumber = new DecimalNumber(input);
        System.out.println(decimalNumber.getAllDigitsReversed());

    }
}
