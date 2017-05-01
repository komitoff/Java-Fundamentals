package model;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age can not be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        if (salary < 460.0) {
            throw new IllegalArgumentException("Salary can't be less than 460.0");
        }
        this.salary = salary;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        try {
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setAge(age);
            this.setSalary(salary);
        }
        catch (Exception e) {
            e.getMessage();
        }
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
