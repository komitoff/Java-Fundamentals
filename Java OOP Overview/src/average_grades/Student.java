package average_grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private List<Double> grades;
    private double average;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    private void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverage() {
        if(this.grades.size() == 0) {
            throw new IllegalArgumentException("There are no grades for this student");
        }
        int size = this.grades.size();
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += this.grades.get(i);
        }
        double average = total / size;
        return average;
    }

    public Student(String name) {
        this.setName(name);
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }
}
