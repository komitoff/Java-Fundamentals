package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OrderByName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Map<String, List<String>> names = new TreeMap<String, List<String>>();
		
		while (!input.toLowerCase().equals("end")) {
			String[] tokens = input.split("\\s+");
			if (!names.containsKey(tokens[0])) {
				names.put(tokens[0], new ArrayList<String>());
			}
			names.get(tokens[0]).add(tokens[1]);
			input = scanner.nextLine();
		}
		
		names.entrySet().stream().forEach(System.out::println);
//		names
//			.entrySet()
//			.stream()
//			.filter(f -> f.getKey().compareToIgnoreCase(f.getValue()) < 0)
//			.peek(f -> System.out.println(f.getKey() + " " + f.getValue()))
//			.forEach(System.out::println);
		scanner.close();
	}
}



