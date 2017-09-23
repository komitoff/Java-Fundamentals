package lab;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double res = a*b/2;
        System.out.printf("Area = %.2f",res);
    }
}
