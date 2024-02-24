package HashSet;
import java.util.HashSet;
import java.util.Scanner;

public class hs4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        while(true) {
            int i = in.nextInt();
            if(i != 0){
                hs.add(i);
            } else break;
        }
        String res = "";
        for(Integer i: hs){
            if (i == 77){
                res = "YES";
            } else res = "NO";
        }
        System.out.println(res);
    }
}
