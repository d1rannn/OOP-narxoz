package MapHashMap;
import java.util.*;

public class map3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        while (true){
            if(hm.entrySet().size() == 5){
                break;
            } else hm.put(in.next(), in.nextInt());
        }

        for (Map.Entry<String, Integer> entry: hm.entrySet()){
            System.out.println(entry.getKey() + " scored " + entry.getValue() + " goals in EPL");
        }
    }
}
