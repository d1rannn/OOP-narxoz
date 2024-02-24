package ArrayList;
import java.util.*;

public class a5
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            a.add(t);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(i >= l && i <= r){
                sum += a.get(i);
            }
        }
        System.out.println(sum);
    }
}
