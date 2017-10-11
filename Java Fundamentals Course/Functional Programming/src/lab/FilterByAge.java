package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterByAge {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        List<Person> people = getPeople();
        String condition = in.nextLine();
        int age = Integer.parseInt(in.nextLine());
        String format = in.nextLine();
        Predicate<String> isOlder = (cond) -> cond.equals("older");

        List<Person> collected = people.stream()
                .filter(isOlder.test(condition) ? x -> x.age >= age : x -> x.age < age)
                .collect(Collectors.toList());

        printStudents(collected, format);
    }

    private static void printStudents(List<Person> collected, String format) {
        switch (format) {
            case "name":
                collected.forEach(x -> System.out.println(x.name));
                break;
            case "age":
                collected.forEach(x -> System.out.println(x.age));
                break;
            default:
                collected.forEach(x -> System.out.printf("%s - %d%n", x.name, x.age));
                break;
        }
    }

    private static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = in.nextLine().split(", ");
            Person p = new Person(data[0], Integer.parseInt(data[1]));
            people.add(p);
        }
        return people;
    }
}

class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
