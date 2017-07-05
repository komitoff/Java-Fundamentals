package average_grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<Student> students = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            Student student = new Student(name);
            if (students.contains(student)) {
            }

            for (int j = 1; j < tokens.length; j++) {
                student.addGrade(Double.parseDouble(tokens[j]));
            }
        }
    }
}
