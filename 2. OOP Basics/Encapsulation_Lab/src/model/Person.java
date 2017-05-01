package model;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Person() { }

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void increaseSalary(int percentage) {
        double newSalary = 0;

        if (this.getAge() > 30) {
            newSalary = this.getSalary() + (this.getSalary() * (percentage / 100.0));
        } else {
            newSalary = this.getSalary() + (this.getSalary() * (percentage / 200.0));
        }

        this.setSalary(newSalary);
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() +
                " get " + this.getSalary() + " leva";
    }
}
