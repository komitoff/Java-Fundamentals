package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        List<Integer> collected = Arrays.stream(Arrays.stream(in.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray())
                .boxed()
                .collect(Collectors.toList());

        Predicate<Integer> isDivisible = x -> {
            for (Integer integer : collected) {
                if (x % integer != 0) {
                    return false;
                }
            }
            return true;
        };
        for (int i = 1; i <= n; i++) {
            if (isDivisible.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
