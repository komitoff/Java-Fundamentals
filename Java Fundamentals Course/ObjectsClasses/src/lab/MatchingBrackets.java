package lab;

import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String equation = scanner.nextLine();
        Stack<Integer> arrayDeque = new Stack<>();

        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '(') {
                arrayDeque.push(i);
            }

            if (equation.charAt(i) == ')') {
                String content = equation.substring(arrayDeque.pop(), i + 1);
                System.out.println(content);
            }
        }
    }
}
