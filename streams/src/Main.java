import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> someNumbers = Arrays.asList(3, 2, 3, 2, 7, 5, 11);
        List<Integer> squaredNumbers = someNumbers.stream()
                .map(i -> i*i)
                .distinct()
                .sorted((i, z) -> Integer.compare(i, z))
                .collect(Collectors.toList());
        squaredNumbers.forEach(System.out::println);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime.getHour());
        System.out.println(currentTime.getMinute());
        System.out.println(currentTime.getSecond());

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId.getRules());
    }
}
