package ex;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class TruckTour {
    private static Scanner in = new Scanner(System.in);
    private static Deque<Station> queue = new ArrayDeque<>();

    public static void main(String[] args) {
        int n = Integer.parseInt(in.nextLine());
        fillQueue(n, queue);
        getFirstIndex();
    }

    private static void getFirstIndex() {
        int i = 0;
        while (true) {
            int liters = 0;
            boolean isCycle = true;
            for (Station station : queue) {
                liters += station.liters;
                liters -= station.distanceToNext;
                if (liters < 0) {
                    isCycle = false;
                    break;
                }
            }
            if (isCycle) {
                System.out.println(i);
                break;
            }
            queue.add(queue.pop());
            i++;
        }
    }


    private static void fillQueue(int n, Deque<Station> queue) {
        for (int i = 0; i < n; i++) {
            int[] tokens = Arrays.stream(in.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Station p = new Station(tokens[0], tokens[1]);
            queue.add(p);
        }
    }

}

class Station {
    int liters;
    int distanceToNext;

    Station(int liters, int distanceToNext) {
        this.liters = liters;
        this.distanceToNext = distanceToNext;
    }
}
