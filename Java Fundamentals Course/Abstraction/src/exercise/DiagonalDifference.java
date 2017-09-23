package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(length, scanner);
        int absoluteDiagonalDifference = calculateDiagonalDifference(matrix);
        System.out.println(absoluteDiagonalDifference);

    }

    private static int calculateDiagonalDifference(int[][] matrix) {
        int primaryDiagonal = 0;
        int secondaryDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    primaryDiagonal += matrix[i][j];
                }
            }
        }

        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            secondaryDiagonal += matrix[i][j];
        }

        return Math.abs(secondaryDiagonal - primaryDiagonal);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(int length, Scanner scanner) {
        int[][] matrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            int[] currentRow = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < length; j++) {
                matrix[i][j] = currentRow[j];
            }
        }
        return matrix;
    }
}
