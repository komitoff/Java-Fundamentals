package exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> people = Arrays.stream(in.nextLine().split("\\s+")).collect(Collectors.toList());
        while (true) {
            String[] data = in.nextLine().split("\\s+");
            String action = data[0];
            if (action.equals("Party!")) {
                break;
            }
            String command = data[1];
            String value = data[2];

            Predicate<String> startPredicate = s -> s.startsWith(value);
            Predicate<String> endPredicate = s -> s.endsWith(value);
            Predicate<String> lengthPredicate = s -> s.length() == Integer.parseInt(value);
            Predicate<String> current = null;

            switch (command) {
                case "StartsWith":
                    current = startPredicate;
                    break;
                case "EndsWith":
                    current = endPredicate;
                    break;
                case "Length":
                    current = lengthPredicate;
                    break;
            }
            switch (action) {
                case "Double":
                    people = doubleArr(people, current);
                    break;
                case "Remove":
                    people.removeIf(current);
                    break;
            }

        }
        print(people);
    }

    private static String join(Collection<?> s, String delimiter) {
        StringBuilder builder = new StringBuilder();
        Iterator<?> iter = s.iterator();
        while (iter.hasNext()) {
            builder.append(iter.next());
            if (!iter.hasNext()) {
                break;
            }
            builder.append(delimiter);
        }
        return builder.toString();
    }

    private static List<String> doubleArr(List<String> people, Predicate<String> current) {
        List<String> res = new ArrayList<>();
        for (String s1 : people) {
            if (current.test(s1)) {
                res.add(s1);
            }
            res.add(s1);
        }
        return res;
    }

    private static void print(List<String> people) {
        if (people.size() > 0) {
            System.out.print(join(people, ", "));
            System.out.print(" are going to the party!");
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }
}
