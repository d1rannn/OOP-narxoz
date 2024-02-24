package HashSet;
import java.util.*;

public class hs9
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        while(true) {
            int i = in.nextInt();
            if(i != 0){
                set.add(i);
            } else break;
        }
        int n = in.nextInt();
        if(set.contains(n)){
            System.out.println("Number "+n+" included in the set.");
        } else System.out.println("Number "+n+" not included in the set.");
    }
}
