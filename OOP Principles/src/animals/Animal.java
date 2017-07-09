package animals;

public abstract class Animal implements SoundProducable{
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0 ) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    public Animal(String name, int age, String gender) {
        this.setAge(age);
        this.setName(name);
        this.setGender(gender);
    }

    @Override
    public void produceSound() {}

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\n" +
                this.getName() + " " +
                this.getAge() + " " +
                this.getGender();
    }

 }
