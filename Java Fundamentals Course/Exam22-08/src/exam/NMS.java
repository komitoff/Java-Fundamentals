package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NMS {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> words = new ArrayList<>();
        String input = reader.readLine();
        StringBuilder text = new StringBuilder();

        while (!input.equalsIgnoreCase("---NMS SEND---")) {
            text.append(input);
            input = reader.readLine();
        }

        StringBuilder word = new StringBuilder();
        char previous = '#';

        for (int i = 0; i < text.length(); i++) {
            if (Character.toLowerCase(text.charAt(i)) >= Character.toLowerCase(previous)) {
                word.append(text.charAt(i));
                previous = text.charAt(i);
            }
            else {
                words.add(word.toString());
                word.setLength(0);
                word.append(text.charAt(i));
                previous = text.charAt(i);
            }
        }

        words.add(word.toString());

        String delimiter = reader.readLine();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            output.append(words.get(i));
            output.append(delimiter);
        }

        System.out.println(output.toString().substring(0, output.length() - delimiter.length()));
    }
}
