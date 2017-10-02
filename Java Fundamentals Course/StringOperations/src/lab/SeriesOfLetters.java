package lab;

import java.util.Scanner;

public class SeriesOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        StringBuilder output = new StringBuilder();
        output.append(input[0]);
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] != input[i + 1]) {
                output.append(input[i + 1]);
            }
        }

        System.out.println(output.toString());
    }
}
