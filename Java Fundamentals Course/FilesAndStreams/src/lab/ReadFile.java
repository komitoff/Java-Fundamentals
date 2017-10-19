package lab;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

    private static final String inputTxtPath =
            System.getProperty("user.dir") + "\\resources\\input.txt";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(inputTxtPath)) {
            int currentByte = fis.read();
            while (currentByte != -1) {
                System.out.printf("%s ", Integer.toBinaryString(currentByte));
                currentByte = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
