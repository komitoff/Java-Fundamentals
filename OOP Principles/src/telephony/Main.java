package telephony;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split("\\s+");
        Callable phone = new Smartphone();
        Browsable browser = new Smartphone();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(phone.call(numbers[i]));
        }

        String[] urls = scanner.nextLine().split("\\s+");

        for (int i = 0; i < urls.length; i++) {
            System.out.println(browser.browse(urls[i]));
        }
    }
}
