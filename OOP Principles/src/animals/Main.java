package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();
        AnimalFactory animalFactory = AnimalFactory.getInstance();
        List<Animal> animals = new ArrayList<>();

        while (!animalType.toLowerCase().equals("Beast!".toLowerCase())) {
            String[] tokens = scanner.nextLine().split("\\s+");
            try {
                Animal animal = animalFactory.getAnimal(animalType, tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                animals.add(animal);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }

            animalType = scanner.nextLine();
        }

        for (Animal a : animals) {
            System.out.println(a.toString());
            a.produceSound();
        }
    }
}
