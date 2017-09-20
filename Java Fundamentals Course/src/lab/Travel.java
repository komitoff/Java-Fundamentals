package lab;

import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        double total = 0;
        if (km >= 20 && km < 100) {
            total = km * 0.09;
        }
        else if (km >= 100) {
            total = km * 0.06;
        } else {
            total += 0.7;
            if (timeOfDay.equalsIgnoreCase("day")) {
                total += km * 0.79;
            } else {
                total += km * 0.9;
            }
        }
        System.out.println(String.format("%.2f", total));
    }
}
