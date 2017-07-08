package interfaces;

public class Citizen implements Person{

    private String name;
    private int age;

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
