package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoundedNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bounds = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::valueOf)
                .toArray();

        int lowerBound = Arrays.stream(bounds).min().getAsInt();
        int higherBound = Arrays.stream(bounds).max().getAsInt();

        List<Integer> numbers =Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::valueOf)
                .filter(x -> lowerBound <= x && x <= higherBound)
                .collect(Collectors.toList());

        numbers.forEach(x -> System.out.print(x + " "));

    }
}
