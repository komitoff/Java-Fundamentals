package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BasicQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> basicQue = new LinkedList<>();

        int[] operations = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < operations[0]; i++) {
            basicQue.add(numbers[i]);
        }

        for (int i = 0; i < operations[1]; i++) {
            basicQue.poll();
        }

        if ( basicQue.size() > 0 ) {
            if (basicQue.contains(operations[2])) {
                System.out.println(true);
            } else {
                Optional<Integer> smallest = basicQue.stream().min(Integer::compareTo);
                System.out.println(smallest.get());
            }
        } else {
            System.out.println(0);
        }
    }
}
