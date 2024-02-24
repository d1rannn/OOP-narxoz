package MapHashMap;
import java.util.*;

public class map2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>(5);
        for (int i = 0; i < 5; i++) {
            hm.put(in.next(), in.nextInt());
        }
        System.out.println(hm.size());
    }
}
