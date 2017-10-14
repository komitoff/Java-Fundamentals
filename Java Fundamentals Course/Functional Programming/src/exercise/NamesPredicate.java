package exercise;

import java.util.Scanner;
import java.util.function.Predicate;

public class NamesPredicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> isLongEnough = x -> x.length() <= n;

        for (int i = 0; i < names.length; i++) {
            if (isLongEnough.test(names[i])) {
                System.out.println(names[i]);
            }
        }
    }
}
