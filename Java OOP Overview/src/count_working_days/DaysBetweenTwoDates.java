package count_working_days;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DaysBetweenTwoDates {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String firstDateFormat = scanner.nextLine();
        String secondDateFormat = scanner.nextLine();
        Calendar calendar = Calendar.getInstance();

        DateFormat format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Date firstDate = format.parse(firstDateFormat);
        Date secondDate = format.parse(secondDateFormat);
        System.out.println(format.format(firstDate));
        calendar.setTime(firstDate);
    }
}
