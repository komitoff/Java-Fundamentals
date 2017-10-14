package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAnExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        numbers.removeIf(x -> x % n == 0);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(numbers.size() - i - 1) + " ");
        }
    }
}
