package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] length = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String aaa = "aaa";

        //String[][] matrix = createMatrix(length[0], length[1], scanner);
    }

    private static String[][] createMatrix(int rows, int cols, Scanner scanner) {
        String[][] matrix = new String[rows][cols];
        int startIndex = 97;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

            }
        }

        return matrix;
    }
}
