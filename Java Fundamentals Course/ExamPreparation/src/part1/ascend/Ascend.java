package part1.ascend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascend {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String regex = "([,_][a-zA-Z]+[0-9])";

        String input = reader.readLine();
        Pattern pattern = Pattern.compile(regex);
        while (!input.equals("Ascend")) {
            boolean flag = true;
            while (flag) {
                flag = false;
                Matcher matcher = pattern.matcher(input);
                while (matcher.find()) {
                    flag = true;
                    String encryptWord = matcher.group();
                    String decryptedWord = decrypt(encryptWord);
                    input = input.replace(encryptWord, decryptedWord);
                }
            }
            System.out.println(input);
            input = reader.readLine();
        }
    }

    private static String decrypt(String encryptWord) {
        char[] encryptedWordArray = encryptWord.toCharArray();
        StringBuilder decryptedWord = new StringBuilder();
        int number = Character.getNumericValue(encryptedWordArray[encryptedWordArray.length - 1]);
        if (encryptedWordArray[0] == ',') {
            for (int i = 1; i < encryptedWordArray.length - 1; i++) {
                decryptedWord.append((char)((int)encryptedWordArray[i] + number));
            }
        }
        else {
            for (int i = 1; i < encryptedWordArray.length - 1; i++) {
                decryptedWord.append((char)((int)encryptedWordArray[i] - number));
            }
        }

        return decryptedWord.toString();
    }
}
