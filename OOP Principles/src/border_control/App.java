package border_control;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Foreigner> foreigners = new ArrayList<>();

        while (!command.toLowerCase().equals("END".toLowerCase())) {
            String[] tokens = command.split("\\s+");

            if (tokens.length > 2) {
                foreigners.add(new Foreigner(tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
            } else {
                foreigners.add(new Foreigner(tokens[0], tokens[1]));
            }
            command = scanner.nextLine();
        }

        String lastDigits = scanner.nextLine();
        for (Foreigner foreigner : foreigners) {
            int start = foreigner.getId().length() - lastDigits.length();
            int end = foreigner.getId().length();
            String digits = foreigner.getId().substring(start, end);
            if (digits.equals(lastDigits)) {
                System.out.println(foreigner.getId());
            }
        }
    }
}
