package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        Map<String, double[]> school = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = reader.readLine();
            double []scores = Arrays.stream(reader.readLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            if (!school.containsKey(name)) {
                school.put(name, scores);
            }

            school.put(name, scores);
        }

        for (Map.Entry<String, double[]> student : school.entrySet()) {
            String average = Arrays.stream(student.getValue()).average().getAsDouble() + "";
            System.out.println(String.format("%s is graduated with %s%n",
                    student.getKey(), average));
        }
    }
}
