package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputData = new StringBuilder();

        String line = scanner.next();
        while (!line.isEmpty()) {
            inputData.append(line);
            inputData.append(" ");
            line = scanner.nextLine();
        }

        String input = inputData.toString();
        Pattern pattern = Pattern.compile("<upcase>(.*?)<\\/upcase>");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String replaced = matcher.group().replaceFirst("<upcase>", "");
            replaced = replaced.replaceFirst("</upcase>", "");
            replaced = replaced.toUpperCase();
            input = input.replaceFirst("<upcase>(.*?)<\\/upcase>", replaced);
        }
        System.out.println(input);
    }
}
