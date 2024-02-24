package MapHashMap;
import java.util.*;

public class map1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            hm.put(in.next(), in.nextInt());
        }

//        for(Map.Entry<String, Integer> entry: hm.entrySet()) {
//            System.out.println(entry.getKey() + " costs " + entry.getValue() + " USD");
//        }

        for(String key : hm.keySet()){
            System.out.println(key + " costs "+hm.get(key)+" USD");
        }
    }
}
