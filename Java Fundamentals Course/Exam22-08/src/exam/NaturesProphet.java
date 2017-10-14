package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class NaturesProphet {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] dimensions = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] garden = new int[dimensions[0]][dimensions[1]];
        fillGardenWithZeros(garden);
        String input = reader.readLine();

        while (!input.equalsIgnoreCase("bloom bloom plow")) {
            int[] position = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            spread(garden, position);
            input = reader.readLine();
        }

        printGarden(garden);
    }

    private static void printGarden(int[][] garden) {
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden[0].length; j++) {
                System.out.print(garden[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillGardenWithZeros(int[][] garden) {
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden[0].length; j++) {
                garden[i][j] = 0;
            }
        }
    }

    private static void spread(int[][] garden, int[] position) {
        int n = position[0];
        int m = position[1];
        garden[n][m] --;
        for (int i = 0; i < garden[n].length; i++) {
            garden[n][i] ++;
        }

        for (int i = 0; i < garden.length; i++) {
            garden[i][m] ++;
        }
    }
}
