import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class STD2 {
    public static char get(String s) throws Exception
    {
        if (s.length() == 0)
        {
            System.out.println("0");
            System.exit(0);
        } else
        {
            Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
            for (int i = 0; i < s.length(); i++)
            {
                if (m.containsKey(s.charAt(i))) {
                    m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
                } else {
                    m.put(s.charAt(i), 1);
                }
            }
            int number;
            number = 0;
            for (Map.Entry<Character, Integer> hm : m.entrySet())
            {
                if (hm.getValue() == 1)
                {
                    number++;
                    return hm.getKey();
                }
            }
            if (number == 0)
            {
                System.out.println("0");
            }
        }
        return 0;
    }
    public static void main(String[] args) throws Exception
    {
        Scanner reader = new Scanner(System.in);
        String n = reader.next();
        System.out.println(get(n));
    }
}