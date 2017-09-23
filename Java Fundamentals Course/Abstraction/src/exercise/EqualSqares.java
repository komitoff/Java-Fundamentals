package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EqualSqares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] length = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[][] matrix = readMatrix(length[0], length[1], scanner);
        int count = findSqaresInMatrix(matrix);
        System.out.println(count);
        scanner.close();
    }

    private static int findSqaresInMatrix(String[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[0].length - 1; j++) {
                if (matrix[i][j].equalsIgnoreCase(matrix[i+1][j]) &&
                        matrix[i+1][j].equalsIgnoreCase(matrix[i][j+1]) &&
                        matrix[i][j+1].equalsIgnoreCase(matrix[i+1][j+1])) {
                    count ++;
                }
            }
        }
        return count;
    }

    private static String[][] readMatrix(int r, int c, Scanner scanner) {
        String [][] matrix = new String[r][c];

        for (int i = 0; i < r; i++) {
            String[] currentRow = scanner.nextLine().split("\\s+");
            for (int j = 0; j < c; j++) {
                matrix[i][j] = currentRow[j];
            }
        }
        return matrix;
    }
}
