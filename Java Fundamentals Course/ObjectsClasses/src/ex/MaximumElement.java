package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        Stack<Integer> numbers = new Stack<>();

        for (int i = 0; i < n; i++) {
            int[] commands = Arrays.stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (commands[0] == 1) {
                numbers.push(commands[1]);
            }
            else if (commands[0] == 2 && numbers.size() != 0) {
                numbers.pop();
            }
            else if (commands[0] == 3) {
                System.out.println(numbers.stream().max(Integer::compare).get());
            }
        }
    }
}
