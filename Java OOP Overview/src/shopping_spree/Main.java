package shopping_spree;

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
            people.add(new Person(personName, money));
        }

        String[] productTokens = scanner.nextLine().split(";");
        for (int i = 0; i < productTokens.length; i++) {
            String[] productPrices = peopleTokens[i].split("=");
            String productName = productPrices[0];
            double productPrice = Double.parseDouble(productPrices[1]);
            products.add(new Product(productName, productPrice));
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String personName = tokens[0];
            String productName = tokens[1];

            command = scanner.nextLine();
        }
    }
}
