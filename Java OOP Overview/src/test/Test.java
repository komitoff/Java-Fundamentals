package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        while (!cmd.equals("END")) {
            System.out.println("NOT END");
            cmd = scanner.nextLine();
        }
    }
}
