package main;

import model.Person;
import model.Team;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String [] input = reader.readLine().split("\\s+");
            try {
                Person person = new Person(
                        input[0],
                        input[1],
                        Integer.parseInt(input[2]),
                        Double.parseDouble(input[3])
                );
                persons.add(person);
            }
            catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
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

//        if (!persons.isEmpty() || persons.size() == n) {
//            System.out.println("--------------------");
//        }
//
//        int bonus = Integer.parseInt(reader.readLine());
//        for (Person person : persons) {
//            person.increaseSalary(bonus);
//            System.out.println(person.toString());
//        }

        Team team = new Team("Minior");
        for (Person person : persons) {
            team.addPlayer(person);
        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
