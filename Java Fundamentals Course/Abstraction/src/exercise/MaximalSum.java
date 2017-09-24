package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] length = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = readMatrix(length[0], length[1], scanner);
        int[][] maximalSumMatrix = findSubmatrix(matrix);
        System.out.println(String.format("Sum = %d",findMaximalSum(maximalSumMatrix)));
        printMatrix(maximalSumMatrix);
    }

    private static int[][] findSubmatrix(int[][] matrix) {
        if (matrix.length <= 3 || matrix[0].length <= 3) {
            return matrix;
        }

        int bestSum = 0;
        int row = 0;
        int col = 0;
        int[][] newMatrix = new int[3][3];

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[0].length - 2; j++) {
                int sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] +
                        matrix[i+1][j] + matrix[i+1][j+1] + matrix[i+1][j+2] +
                        matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];

                if (sum > bestSum) {
                    bestSum = sum;
                    row = i;
                    col = j;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                newMatrix[i][j] = matrix[row+i][col+j];
            }
        }

        return newMatrix;
    }

    private static int findMaximalSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] currentRow = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = currentRow[j];
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
