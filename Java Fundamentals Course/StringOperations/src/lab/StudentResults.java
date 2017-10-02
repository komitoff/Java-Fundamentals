package lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" - ");
        String name = tokens[0];
        double[] grades = Arrays.stream(tokens[1].split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        double average = Arrays.stream(grades).average().getAsDouble();
        System.out.println(String.format
                ("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|",
                        "Name", "JAdv", "JavaOOP", "AdvOOP", "Average"
                ));
        System.out.println(String.format(
                "%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",
                name, grades[0], grades[1], grades[2], average
                ));
    }
}
