package lab;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tobieski on 10/17/2017.
 */
public class WriteToFile {

    private static final String inputTxtPath =
            System.getProperty("user.dir") + "\\resources\\Files-and-Streams";

    private static final String outputTxtPath =
            System.getProperty("user.dir") + "\\resources\\output.txt";

    public static void main(String[] args) {
        File f = new File(inputTxtPath);
        BFS(f.listFiles());
    }

    private static void BFS(File[] files) {
        Deque<File> queue = new ArrayDeque<>();
        queue.addLast(new File(inputTxtPath));
        int counter = 0;
        while (!queue.isEmpty()) {
            File pop = queue.poll();
            System.out.println(pop.getName());
            counter++;
            File[] nastedFiles = pop.listFiles();
            if (nastedFiles != null) {
                for (File nastedFile : nastedFiles) {
                    if (nastedFile.isDirectory()) {
                        queue.addLast(nastedFile);
                    }
                }
            }
        }
        System.out.printf("%d folders", counter);
    }
}
