package lab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantity = scanner.nextDouble();

        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        double priceBgn = quantity * 1.2;
        BigDecimal result = exchangeRate.multiply(new BigDecimal(priceBgn));
        System.out.println(String.format("%.2f marks", result));
    }
}
