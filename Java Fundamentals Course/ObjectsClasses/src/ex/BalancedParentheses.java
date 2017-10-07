package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedParentheses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int opening = 0;
        int closing = 0;

        String line = reader.readLine();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '(' ||
                    line.charAt(i) == '{' ||
                    line.charAt(i) == '[') {
                opening ++;
            }
            else if (line.charAt(i) == ')' ||
                    line.charAt(i) == '}' ||
                    line.charAt(i) == ']') {
                closing ++;
            }
        }

        System.out.println(opening == closing);
    }
}
