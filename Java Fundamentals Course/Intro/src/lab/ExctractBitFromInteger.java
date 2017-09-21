package lab;

        import java.util.Scanner;

public class ExctractBitFromInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int p = Integer.parseInt(input[1]);
        System.out.println(1 & (n >> p));
    }
}
