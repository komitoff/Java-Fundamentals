package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> basicStack = new Stack<>();

        int[] operations = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < operations[0]; i++) {
            basicStack.push(numbers[i]);
        }

        for (int i = 0; i < operations[1]; i++) {
            basicStack.pop();
        }

        if ( basicStack.size() > 0 ) {
            if (basicStack.contains(operations[2])) {
                System.out.println(true);
            } else {
                Optional<Integer> smallest = basicStack.stream().min(Integer::compareTo);
                System.out.println(smallest.get());
            }
        } else {
            System.out.println(0);
        }
    }
}
