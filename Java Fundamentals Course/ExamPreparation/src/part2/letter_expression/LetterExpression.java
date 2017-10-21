package part2.letter_expression;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import sun.rmi.server.InactiveGroupException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterExpression {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String regex = "(?<firstNumber>[0-9]*\\.?[0-9]*)(?<text>[a-zA-Z!@#$%^&]*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        ArrayDeque<Double> numbers = new ArrayDeque<>();
        ArrayDeque<String> operations = new ArrayDeque<>();
        while (matcher.find()) {
            if (!matcher.group("firstNumber").equals("") || !matcher.group("text").equals("")) {
                numbers.offer(Double.valueOf(matcher.group("firstNumber")));
                operations.offer(matcher.group("text"));
            }
        }

        double totalSum = numbers.poll();

        while (numbers.size() > 0) {
            double number = numbers.poll();

            String operation = operations.poll();
            if (operation.length() % 2 == 0) {
                totalSum += number;
            }
            else {
                totalSum -= number;
            }
        }
        DecimalFormat df = new DecimalFormat("##.#######");
        System.out.println(df.format(totalSum));
    }
}
