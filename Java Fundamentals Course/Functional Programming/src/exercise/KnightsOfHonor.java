package exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        Consumer<String> print = x -> System.out.println("Sir " + x);
        Arrays.stream(names).forEach(print);
    }
}
