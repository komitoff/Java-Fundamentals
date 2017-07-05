package shopping_spree;

import com.sun.javafx.binding.StringFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        String[] peopleTokens = scanner.nextLine().split(";");
        for (int i = 0; i < peopleTokens.length; i++) {
            String[] peopleAndMoney = peopleTokens[i].split("=");
            String personName = peopleAndMoney[0];
            double money = Double.parseDouble(peopleAndMoney[1]);
            try {
                people.add(new Person(personName, money));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
                return;
            }
        }

        String[] productTokens = scanner.nextLine().split(";");
        for (int i = 0; i < productTokens.length; i++) {
            String[] productPrices = productTokens[i].split("=");
            String productName = productPrices[0];
            double productPrice = Double.parseDouble(productPrices[1]);
            products.add(new Product(productName, productPrice));
        }

        String command = scanner.nextLine();

        while (!command.toUpperCase().equals("END") || !command.equals("")) {
            String[] tokens = command.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];
            Person currentPerson = people.get(personIndex(personName, people));
            Product currentProduct = products.get(productIndex(productName, products));
            if (currentPerson.getMoney() >= currentProduct.getCost()) {
                System.out.printf("%s bought %s", currentPerson.getName(), currentProduct.getName());
                currentPerson.setMoney(currentPerson.getMoney() - currentProduct.getCost());
                people.get(personIndex(personName, people)).setMoney(currentPerson.getMoney());
                people.get(personIndex(personName, people)).addProduct(currentProduct);
                System.out.println();
            }
            else {
                System.out.printf("%s can't afford %s", currentPerson.getName(), currentProduct.getName());
                System.out.println();
            }
            command = scanner.nextLine();
        }

        for (Person person : people) {
            System.out.print(person.getName() + " - ");
            if(person.getBagOfProducts().size() == 0) {
                System.out.println("Nothing bought");
            }
            else {
                StringBuffer sb = new StringBuffer();
                for (Product product : person.getBagOfProducts()) {
                    sb.append(", ");
                    sb.append(product.getName());
                }
                sb.replace(0,2, "");
                System.out.println(sb);
            }
        }
    }

    public static int personIndex(String name, List<Person> people) {
        int index = 0;
        for(Person person : people) {
            String currentName = person.getName();
            if (name.equals(currentName)) {
                break;
            }
            index ++;
        }
        return index;
    }

    public static int productIndex(String name, List<Product> products) {
        int index = 0;
        for(Product product : products) {
            String currentName = product.getName();
            if (name.equals(currentName)) {
                break;
            }
            index ++;
        }
        return index;
    }
}
