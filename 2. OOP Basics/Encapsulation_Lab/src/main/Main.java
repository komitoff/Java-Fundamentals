package main;

import model.Person;
import sun.rmi.server.InactiveGroupException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] input = reader.readLine().split("\\s+");
            persons.add(new Person(input[0],
                    input[1],
                    Integer.parseInt(input[2]),
                    Double.parseDouble(input[3])
            ));
        }

//        Collections.sort(persons, (firstPerson, secondPerson) -> {
//            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
//
//            if (sComp != 0) {
//                return sComp;
//            }
//            else {
//                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
//            }
//        });

        int bonus = Integer.parseInt(reader.readLine());

        for (Person person : persons) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }

    }
}
