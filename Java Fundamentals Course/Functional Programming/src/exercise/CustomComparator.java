package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = Arrays.stream(in.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] evens = Arrays.stream(numbers).filter(x -> x % 2 == 0).boxed().sorted(Integer::compareTo).mapToInt(Integer::valueOf).toArray();
        int[] odds = Arrays.stream(numbers).filter(x -> x % 2 != 0).boxed().sorted(Integer::compareTo).mapToInt(Integer::valueOf).toArray();
        Arrays.stream(evens).forEach(x -> System.out.print(x + " "));
        System.out.print(Arrays.toString(odds).replace("]", "").replace("[", "").replace(",", ""));
    }
}
