package animals;

public class Kitten extends Cat{

    public Kitten(String name, int age, String gender) {
        super(name, age, "Female");
    }

    public void produceSound() {
        System.out.println("Miau");
    }
}
