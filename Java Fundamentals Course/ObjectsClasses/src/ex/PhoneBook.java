package ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, String> phoneBook = readPhoneBook();

        String contact = reader.readLine();
        while (!contact.equalsIgnoreCase("stop")) {
            if (phoneBook.containsKey(contact)) {
                System.out.println(String.format("%s -> %s",
                        contact, phoneBook.get(contact)));
            }
            else {
                System.out.println(String.format("Contact %s does not exist.", contact));
            }
            contact = reader.readLine();
        }
    }

    private static Map<String,String> readPhoneBook() throws IOException {
        Map<String, String> phoneBook = new HashMap<>();

        String line = reader.readLine();
        while (!line.equalsIgnoreCase("search")) {
            String[] tokens = line.split("-");
            phoneBook.put(tokens[0], tokens[1]);
            line = reader.readLine();
        }

        return phoneBook;
    }
}
