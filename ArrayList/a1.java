package ArrayList;
import java.util.*;

public class a1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int e = in.nextInt();
            a.add(e);
        }
        for (Integer j: a) {
            System.out.print(j/2 + " ");
        }
    }
}
