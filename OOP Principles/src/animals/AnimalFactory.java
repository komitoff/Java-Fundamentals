package animals;

public class AnimalFactory {


    public static AnimalFactory getInstance() {
        return new AnimalFactory();
    }

    public Animal getAnimal(String type, String name, int age, String gender) {
        switch (type.toLowerCase()) {
            case "cat":
                return new Cat(name, age, gender);
            case "dog":
                return new Dog(name, age, gender);
            case "frog":
                return new Frog(name, age, gender);
            case "kitten":
                return new Kitten(name, age, gender);
            case "tomcat":
                return new Tomcat(name, age, gender);
        }
        return null;
    }
}
