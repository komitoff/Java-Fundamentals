package ex;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] line = in.nextLine().toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        boolean b = addPopBrackets(stack, line);
        printYesNo(b);
    }

    private static void printYesNo(boolean b) {
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean addPopBrackets(Deque<Character> stack, char[] line) {
        for (char c : line) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (!stack.isEmpty()) {
                    Character pop = stack.pop();
                    if (c == ')' && pop != '(') {
                        return false;
                    } else if (c == '}' && pop != '{') {
                        return false;
                    } else if (c == ']' && pop != '[') {
                        return false;
                    }
                } else {
                    return false;
                }

            }
        }
        return true;
    }
}
