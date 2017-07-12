package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> studentsGroups = new TreeMap<>();

        String input = scanner.nextLine();

        while(!input.toLowerCase().equals("end")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0] + " " + tokens[1];
            int group = Integer.parseInt(tokens[2]);
            studentsGroups.put(name, group);
            input = scanner.nextLine();
        }

        studentsGroups
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 2)
                .forEach(x -> System.out.println(x));
    }
}
