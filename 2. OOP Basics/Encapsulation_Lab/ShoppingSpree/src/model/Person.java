package model;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private double cash;
    private List<Product> bagOfProducts;

    public Person (String name, double cash) {
        this.setName(name);
        this.setCash(cash);
        this.bagOfProducts = new ArrayList<Product>();
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty string");
        }
        this.name = name;
    }

    public double getCash() {
        return this.cash;
    }

    private void setCash(double cash) {
        if (cash < 0 ) {
            throw new IllegalArgumentException("Money cannot be negative number");
        }
        this.cash = cash;
    }
}
