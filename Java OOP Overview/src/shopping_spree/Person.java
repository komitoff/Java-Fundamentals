package shopping_spree;

import com.sun.scenario.effect.impl.prism.PrDrawable;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> bagOfProducts;

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return this.money;
    }

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.bagOfProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.bagOfProducts.add(product);
    }
}

