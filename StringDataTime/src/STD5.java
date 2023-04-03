import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class STD5 {
    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static long Age(String Now, String Birthday) {

        return Math.abs(ChronoUnit.YEARS.between(LocalDate.parse(Birthday, format), LocalDate.parse(Now, format)));
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String now = reader.next();
        String birth = reader.next();
        System.out.println(Age(now, birth));
    }
}