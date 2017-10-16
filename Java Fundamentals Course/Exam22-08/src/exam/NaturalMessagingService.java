package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NaturalMessagingService {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> words = new ArrayList<>();

        String input = reader.readLine();
        StringBuilder currentWord = new StringBuilder();
        StringBuilder wholeText = new StringBuilder();

        while (!input.equals("---NMS SEND---")) {
            wholeText.append(input);
            input = reader.readLine();
        }

        char lastChar = '#';
        currentWord.append(wholeText.charAt(0));
        String copy = wholeText.toString().toLowerCase();
        for (int i = 1; i < wholeText.length() - 1; i++) {
            if (copy.charAt(i) <= copy.charAt(i + 1)) {
                currentWord.append(wholeText.charAt(i));
            }
            else {
                currentWord.append(wholeText.charAt(i));
                words.add(currentWord.toString());
                currentWord.setLength(0);
                if (i + 1 == wholeText.length()) {
                    lastChar = wholeText.charAt(i + 1);
                }
            }

        }

        if (lastChar != '#') {
            currentWord.append(lastChar);
            words.add(currentWord.toString());
        }
        String delimiter = reader.readLine();
        System.out.println(String.join(delimiter, words));
//        StringBuilder output = new StringBuilder();
//        for (int i = 0; i < words.size(); i++) {
//            output.append(words.get(i));
//            output.append(delimiter);
//        }
//
//        System.out.println(output.toString().substring(0, output.length() - delimiter.length()));
    }
}
