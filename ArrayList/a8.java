package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class a8
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int i;
        while (true){
            i = in.nextInt();
            if(i != 0){
                a.add(i);
            } else break;
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int j = 0; j < a.size(); j++) {
            if (a.get(j) < 0){
                res.add(a.get(j));
            }
        }

        for (int l = 0; l < res.size(); l++){
            System.out.print(res.get(l) + " ");
        }

        int max = res.get(0);
        for (int l = 0; l < res.size(); l++){
            if(max < res.get(l)){
                max = res.get(l);
            }
        }
        System.out.println();
        System.out.println(max);
    }
}
