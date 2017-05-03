package main;

import model.Person;
import model.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> people = new ArrayList<>();
        List<Product> products = new ArrayList<>();

        String[] participantsTokens = reader.readLine().split(";");
        for (int i = 0; i < participantsTokens.length; i++) {
            String[] infoTokens = participantsTokens[i].split("=");
            String name = infoTokens[0];
            double cash = Double.parseDouble(infoTokens[1]);
            people.add(new Person(name, cash));
        }

        String[] productsTokens = reader.readLine().split(";");
        for (int i = 0; i < productsTokens.length; i++) {
            String[] infoTokens = productsTokens[i].split("=");
            String name = infoTokens[0];
            double cost = Double.parseDouble(infoTokens[1]);
        }

        String command = reader.readLine();

        while (!command.toLowerCase().equals("end")) {
            String[] tokens = command.split(" ");
            String personsName = tokens[0];
            String productName = tokens[1];
            
        }

    }
}
