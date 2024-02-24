package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class a9
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int i;
        while (true) {
            i = in.nextInt();
            if (i != 0) {
                a.add(i);
            } else break;
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int j = 0; j < a.size(); j++) {
            int aa = 0;
            for (int k = 1; k <= a.get(j); k++) {
                if (a.get(j) % k == 0) {
                    aa++;
                }
            }
            if (aa == 2) {
                System.out.println(a.get(j));
            }
        }
        for (int l = 0; l < res.size(); l++){
            System.out.print(res.get(l) + " ");
        }
    }
}
