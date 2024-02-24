package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class hs2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>(5);
        for (int i = 0; i < 5; i++) {
            int s = in.nextInt();
            hs.add(s);
        }
        int sum = 0;
        for(Integer i: hs){
            sum += i;
        }
        System.out.println(sum);
    }
}
