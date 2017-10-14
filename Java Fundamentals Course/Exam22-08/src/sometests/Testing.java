package sometests;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Testing {
    public static void main(String[] args) {
        Queue<Integer> stack = new LinkedList<>();
        stack.add(1);
        stack.add(2);
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
    }
}
