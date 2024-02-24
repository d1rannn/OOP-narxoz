package ArrayList;
import java.util.*;

public class a3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            a.add(t);
        }
        int max2 = a.get(0);
        int max1 = a.get(0);
        for (int i = 0; i < n; i++) {
            if(a.get(i) > max1) {
                max2 = max1;
                max1 = a.get(i);
            }
            if(a.get(i) > max2 && a.get(i) != max1) {
                max2 = a.get(i);
            }
        }
        System.out.print(max2);
    }
}
