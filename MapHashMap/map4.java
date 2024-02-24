package MapHashMap;
import java.util.*;

public class map4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] words = str.split(" ");
        List<String> list = new ArrayList<String>();
        for(String s: words){
            list.add(s);
        }
        Set<String> unique = new HashSet<String>(list);
        for (String key : unique) {
            int accurNO = Collections.frequency(list, key);
            System.out.println("'"+key+"' occurs "+accurNO+" times");
        }
    }
}
