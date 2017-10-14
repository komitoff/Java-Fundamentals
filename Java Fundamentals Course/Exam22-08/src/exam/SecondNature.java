package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class SecondNature {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> flowersWeissDust = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> bucketsWithWater = Arrays.stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Stack<Integer> buckets = new Stack<>();
        Queue<Integer> flowers = new LinkedList<>();
        List<Integer> bloomed = new ArrayList<>();

        buckets.addAll(bucketsWithWater);
        flowers.addAll(flowersWeissDust);

        Integer currentBucket = 0;
        Integer currentWeiss = 0;
        Integer leftWater = 0;
        Integer previousWeiss = 0;

        while (true) {

            if (flowers.isEmpty()) {
                printLeftBuckets(buckets, leftWater);
                break;
            }

            if (buckets.isEmpty()) {
                printLeftWeiss(flowers, previousWeiss);
                break;
            }


            currentBucket = buckets.pop() + leftWater;

            if ( previousWeiss == 0) {
                currentWeiss = flowers.poll();
            } else {
                currentWeiss = previousWeiss;
            }

            if (currentBucket == currentWeiss) {
                bloomed.add(currentWeiss);
                leftWater = 0;
                previousWeiss = 0;
            }

            if (currentBucket > currentWeiss) {
                leftWater = currentBucket - currentWeiss;
            }

            if (currentWeiss > currentBucket) {
                previousWeiss = currentWeiss - currentBucket;
            }
        }

        if (bloomed.isEmpty()) {
            System.out.println("None");
        } else {
            bloomed.forEach(x -> System.out.print(x + " "));
        }
    }

    private static void printLeftWeiss(Queue<Integer> flowers, int previousWeiss) {
        if (!flowers.isEmpty()) {
            StringBuilder output = new StringBuilder();
            while (!flowers.isEmpty()) {
                output.append(flowers.poll());
                output.append(" ");
            }
            System.out.println(output.toString().substring(0, output.length() - 1));
        }
    }

    private static void printLeftBuckets(Stack<Integer> buckets, int leftWater) {
        if (!buckets.isEmpty()) {
            int current = buckets.pop() + leftWater;
            leftWater = 0;
            StringBuilder output = new StringBuilder();
            output.append(current);
            output.append(" ");
            while (!buckets.isEmpty()) {
                output.append(buckets.pop());
                output.append(" ");
            }
            System.out.println(output.toString().substring(0, output.length() - 1));
        }

        if (leftWater != 0) {
            System.out.println(leftWater);
        }
    }
}
