package streams;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OrderByGroup {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Map<String, Integer> studentGroups = new TreeMap<String, Integer>();
		
		while (!input.toLowerCase().equals("end")) {
			String[] tokens = input.split("\\s+");
			String name = tokens[0] + " " + tokens[1];
			int group = Integer.parseInt(tokens[2]);
			studentGroups.put(name, group);
			input = scanner.nextLine();
		}
		
		studentGroups
				.entrySet()
				.stream()
				.filter(x -> x.getValue() == 2)
				.forEach(x -> System.out.println(x.getKey()));
		
		scanner.close();
	}
}
