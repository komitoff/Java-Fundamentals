package exercise;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double f11 = (((a*a) + (b*b)) / ((a*a) - (b*b)));
        double f12 = (a + b + c) / (Math.sqrt(c));
        double f1 = Math.pow(f11, f12);

        double f21 = ((a*a) + (b*b) - (Math.pow(c, 3)));
        double f22 = (a - b);
        double f2 = Math.pow(f21, f22);
        double avgPts = (a + b + c) / 3;
        double avgFormulas = (f1 + f2) / 2;

        double diff = Math.abs(avgPts - avgFormulas);

        System.out.println(String.format("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff));
    }
}
