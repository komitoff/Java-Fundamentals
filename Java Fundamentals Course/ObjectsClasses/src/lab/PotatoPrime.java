package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class PotatoPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<String> players = new ArrayDeque<>();
        String[] input = reader.readLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            players.offer(input[i]);
        }
        int n = Integer.parseInt(reader.readLine());
        int cycle = 1;
        while (players.size() > 1) {
            for (int i = 1; i < n; i++) {
                players.offer(players.poll());
            }

            if (!isPrime(cycle)) {
                System.out.println("Removed " + players.poll());
            }
            else {
                System.out.println("Prime " + players.peek());
            }
            cycle++;
        }

        System.out.println("Last is " + players.poll());

    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
