package lab;

import java.util.Scanner;

public class ModifyBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int v = scanner.nextInt();

        if (v == 0) {
            int mask = ~(1 << p);
            System.out.println(n & mask);
        } else {
            int mask = 1 << p;
            System.out.println(n | mask);
        }

    }
}
