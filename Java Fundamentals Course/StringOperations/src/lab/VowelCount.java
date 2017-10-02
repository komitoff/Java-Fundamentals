package lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");
        Matcher matcher = pattern.matcher(text);
        int cnt = 0;
        while (matcher.find()) {
            cnt ++;
        }
        System.out.println(String.format("Vowels: %d", cnt));
    }
}
