package ArrayList;
import java.util.*;

public class a2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int e = in.nextInt();
            a.add(e);
        }
        double sum = 0;
        for (Integer j: a) {
            sum += j;
        }
        double res = sum / n;
        System.out.println(res);
    }
}
