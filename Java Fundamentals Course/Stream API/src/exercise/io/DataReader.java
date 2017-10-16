package exercise.io;

import exercise.repository.Student;

import java.io.*;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataReader {

    private static final String resourcePath = System.getProperty("user.dir");

    public static List<Student> readData(String fileName) {
        String path = resourcePath + "\\" + fileName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            line = reader.readLine();
            String[] splitted = line.split("\\s+");
            List<Integer> grades = readGrades(Arrays.copyOfRange(splitted, 6, 10));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> readGrades(String[] splitted) {
        List<Integer> grades = new ArrayList<>();
        for (String s : splitted) {
            grades.add(Integer.parseInt(s));
        }
        return grades;
    }
}
