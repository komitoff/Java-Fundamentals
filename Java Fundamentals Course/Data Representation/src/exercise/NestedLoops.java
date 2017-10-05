package exercise;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] array = new int[n];
        printNestedLoops(array, n, 0);
    }

    private static void printNestedLoops(int[] array, int n, int loop) {
        if (loop == n) {
            print(array, n);
            return;
        }
        for (int i = 1; i <= n; i++) {
            array[loop] = i;
            printNestedLoops(array, n, loop + 1);
        }
    }

    private static void print(int[] array, int n) {
        int c = 0;
        for (int i : array) {
            if (c % n == 0) {
                System.out.println();
            }
            System.out.print(i + " ");
            c++;
        }
    }

}
