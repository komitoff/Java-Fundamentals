package lab;

import java.util.Collections;
import java.util.Scanner;

public class RecursiveDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        drawFigure(n);
    }

    private static void drawFigure(int n) {
        drawStars(n);
        drawHashTags(1, n);
    }

    private static void drawHashTags(int start, int end) {
        drawLine("#", start);
        if (start == end) {
            return;
        }
        drawHashTags(start + 1, end);
    }

    private static void drawStars(int n) {
        drawLine("*", n);
        if (n == 1) {
            return;
        }
        drawStars(n - 1);
    }

    private static void drawLine(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
        System.out.println();
    }
}

