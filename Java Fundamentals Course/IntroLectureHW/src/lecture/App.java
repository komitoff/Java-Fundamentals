package lecture;

import java.util.Scanner;

public class App {
	public static void main(String [] args) {
		
		//1
		Scanner scanner = new Scanner(System.in);
		Double a = scanner.nextDouble();
		Double b = scanner.nextDouble();
		System.out.println(String.format("%.2f", a*b));
		
		//2
		
		
		scanner.close();
	}
}
