package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Potato {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<String> players = new ArrayDeque<>();
        String[] input = reader.readLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            players.offer(input[i]);
        }
        int n = Integer.parseInt(reader.readLine());

        while (players.size() > 1) {
            for (int i = 1; i < n; i++) {
                players.offer(players.poll());
            }
            System.out.println("Removed " + players.poll());
        }
        System.out.println("Last is " + players.poll());
    }
}
