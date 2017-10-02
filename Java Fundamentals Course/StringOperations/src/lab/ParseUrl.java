package lab;

import java.util.Scanner;

public class ParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] urlTokens = scanner.nextLine().split("://");
        String protocol = urlTokens[0];
        int serverEndIndex = urlTokens[1].indexOf("/");
        String server = urlTokens[1].substring(0, serverEndIndex);
        String resource = urlTokens[1].substring(serverEndIndex + 1, urlTokens[1].length());

        System.out.println("Protocol = " + protocol);
        System.out.println("Server = " + server);
        System.out.println("Resources = " + resource);

    }
}
