import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Scanner;

public class STD1
{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String n = reader.next();
        String[] stringarray = n.split("");

        Map<String, Long> map = Arrays.stream(stringarray).collect(Collectors.groupingBy(c -> c , Collectors.counting()));
        map.forEach((k, v) -> System.out.println(k + " : "+ v));
    }
}