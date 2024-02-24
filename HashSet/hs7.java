package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class hs7
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
        System.out.println(hs);
    }
}
