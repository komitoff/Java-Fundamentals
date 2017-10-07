package lab;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.HashSet;
        import java.util.Set;

public class CarParking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Set<String> cars = new HashSet<>();

        while (!input.equalsIgnoreCase("end")) {
            String[] tokens = input.split(", ");

            if (tokens[0].equalsIgnoreCase("in")) {
                cars.add(tokens[1]);
            }
            else {
                cars.remove(tokens[1]);
            }
            input = reader.readLine();
        }

        printCarsInParkingLot(cars);
    }

    private static void printCarsInParkingLot(Set<String> cars) {
        if (cars.size() == 0) {
            System.out.println("Parking Lot is Empty");
        }
        else {
            cars.stream().forEach(System.out::println);
        }
    }
}
