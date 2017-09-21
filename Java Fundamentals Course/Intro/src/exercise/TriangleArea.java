package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] b = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] c = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        double area = Math.abs(((a[0] * (b[1] - c[1])) +
                                 (b[0] * (c[1] - a[1]) +
                                         (c[0] * (a[1] - b[1]))))/2);
        System.out.println(Math.round(area));
    }
}
