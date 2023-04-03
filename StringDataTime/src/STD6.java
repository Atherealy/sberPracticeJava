import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class STD6 {
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    public static List<LocalDate> daysBetweenDates(String beginDate, String endDate) {
        LocalDate firstDate = LocalDate.parse(beginDate, format);
        LocalDate lastDate = LocalDate.parse(endDate, format);

        List<LocalDate> dates = new ArrayList<>(firstDate.datesUntil(lastDate, Period.ofDays(1)).toList());
        dates.add(lastDate);
        return dates;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String begDate = reader.next();
        String eDate = reader.next();
        System.out.println(daysBetweenDates(begDate, eDate));
    }
}