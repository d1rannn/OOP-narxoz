package ArrayList;
import java.util.*;

public class a4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            a.add(t);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(a.get(i) > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
