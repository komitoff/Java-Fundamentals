package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SymbolCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (!symbols.containsKey(text.charAt(i))) {
                symbols.put(text.charAt(i), 0);
            }
            symbols.put(text.charAt(i), symbols.get(text.charAt(i)) + 1);
        }

        for (Map.Entry<Character, Integer> symbol : symbols.entrySet()) {
            System.out.println(String.format("%s: %d time/s", symbol.getKey(), symbol.getValue()));
        }
    }
}
