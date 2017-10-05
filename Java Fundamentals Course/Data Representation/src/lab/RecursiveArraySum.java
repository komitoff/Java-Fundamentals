package lab;

import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] line = getArray(in.nextLine());
        System.out.println(findArraySum(line));
    }

    private static int findArraySum(int[] line) {
        return findArraySum(line, line.length - 1);
    }

    private static int findArraySum(int[] line, int i) {
        if (i < 0) {
            return 0;
        }
        return line[i] + findArraySum(line, i - 1);
    }

    private static int[] getArray(String s) {
        String[] split = s.split("\\s+");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        return arr;
    }
}
