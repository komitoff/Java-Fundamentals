package lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        BigDecimal result = new BigDecimal(1);
        for (int i = start; i <= end ; i++) {
            result = result.multiply(new BigDecimal(i));
        }
        System.out.println(String.format("product[%d..%d] = %.0f",
                start, end, result));
    }
}
