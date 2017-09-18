package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByEmail {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> people = new ArrayList<String>();
		
		String input = scanner.nextLine();
		String emial = "tobo@gmail.com";
		
		while (!input.toLowerCase().equals("end")) {
			String[] tokens = input.split("\\s+");
			String name = tokens[0] + " " + tokens[1];
			String email = tokens[2];
			
			if (email.toLowerCase().contains("@gmail")) {
				people.add(name);
			}
			
			input = scanner.nextLine();
		}
		
		people.stream().forEach(System.out::println);
		scanner.close();
	}
}
