package border_control;

public class Foreigner implements Robot, Citizen{

    private String name;
    private String id;
    private String model;
    private int age;

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Foreigner(String model, String id) {
        this.model = model;
        this.id = id;
    }

    public Foreigner(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
