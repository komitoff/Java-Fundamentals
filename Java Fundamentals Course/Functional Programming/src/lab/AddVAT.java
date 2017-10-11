package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Double> numbers = Arrays.stream(reader.readLine().split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        Function<Double, Double> addVat = x -> x * 1.2;
        System.out.println("Prices with VAT:");
        numbers.forEach(x -> System.out.println(String.format("%.2f", addVat.apply(x)).replace('.', ',')));
    }
}
