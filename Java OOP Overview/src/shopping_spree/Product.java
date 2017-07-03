package shopping_spree;

public class Product {
    private String name;
    private double cost;

    private void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative");
        }
        return this.cost;
    }

    public Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }
}
