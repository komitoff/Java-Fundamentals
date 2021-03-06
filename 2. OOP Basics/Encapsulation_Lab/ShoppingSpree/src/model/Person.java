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

    public void addProduct(Product product) {
        if (product.getCost() > this.getCash()) {
            throw new IllegalArgumentException(this.getName() + " can't afford " + product.getName());
        }
        this.bagOfProducts.add(product);
    }

    public void printShoppingList() {
        if (this.bagOfProducts.size() == 0) {
            System.out.println(this.getName() + " - Nothing bought");
        }
        else {
            System.out.println(this.getName() + );
        }
    }
//    @Override
//    public String toString () {
//
//    }
}
