package lab;

import java.util.Scanner;

public class RecursiveFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        System.out.println(getFactorial(n));
    }

    private static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }
}
