package streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderOfAppearance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> people = new LinkedHashMap<String, Integer>();

		String input = scanner.nextLine();
		
		while (!input.toLowerCase().equals("end")) {
			String[] tokens = input.split("\\s+");
			String name = tokens[0] + " " + tokens[1];
			int age = Integer.parseInt(tokens[2]);
			people.put(name, age);
			input = scanner.nextLine();
		}
		
		people
			.entrySet()
			.stream()
			.filter(x -> x.getValue() >= 18 && x.getValue() <=24)
			.forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
		
		scanner.close();
	}
}
