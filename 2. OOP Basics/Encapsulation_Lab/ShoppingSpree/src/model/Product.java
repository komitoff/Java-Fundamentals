package model;

public class Product {
    private String name;
    private double cost;

    public Product (String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length() < 0) {
            throw new IllegalArgumentException("Name cannot be empty string");
        }
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    private void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative number");
        }
        this.cost = cost;
    }
}
