package exercise;

import java.util.Scanner;

public class FillMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int length = Integer.parseInt(input[0]);
        String method = input[1];
        int[][] matrix = createMatrix(method, length);
        printMatrix(matrix);
    }

    private static int[][] createMatrix(String method, int length) {
        if (method.equalsIgnoreCase("a")) {
            return createFirstTypeMatrix(length);
        } else {
            return createSecondTypeMatrix(length);
        }
    }

    private static int[][] createFirstTypeMatrix(int length) {
        int[][] matrix = new int[length][length];
        int value = 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[j][i] = value;
                value++;
            }
        }

        return matrix;
    }

    private static int[][] createSecondTypeMatrix(int length) {
        int[][] matrix = new int[length][length];
        int value = 1;
        boolean flag = false;
        for (int i = 0; i < length; i++) {

            if (flag) {
                for (int j = length - 1; j >= 0; j--) {
                    matrix[j][i] = value;
                    value ++;
                }
                flag = false;
            }
            else {
                for (int j = 0; j < length; j++) {
                    matrix[j][i] = value;
                    value++;
                }
                flag = true;
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }


}
