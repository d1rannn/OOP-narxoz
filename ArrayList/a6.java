package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class a6
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
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i >= l && i <= r){
                res.add(a.get(i));
            }
        }
        for (int i = res.size()-1; i >= 0; i--) {
            System.out.print(res.get(i) + " ");
        }
    }
}
