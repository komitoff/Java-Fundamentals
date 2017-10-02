package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTags {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine().trim();
//        Pattern pattern = Pattern.compile("(<[^>]*>)");
//
//        while (!text.equalsIgnoreCase("end")) {
//            Matcher matcher = pattern.matcher(text);
//            System.out.println(matcher.groupCount());
//            text = scanner.nextLine();
//        }
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> tags = new ArrayList<>();
        while (true) {
            String line = in.nextLine().trim();
            if (line.equals("END")) {
                break;
            }
            String pattern = "<.*?>";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(line);
            while (m.find()) {
                tags.add(m.group());
                line = line.replace(m.group(), "");
            }
        }
        printTags(tags);
    }

    private static void printTags(List<String> tags) {
        for (String tag : tags) {
            System.out.println(tag);
        }
    }
}
