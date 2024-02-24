package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class a7
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
            for (int k = j+1; k < a.size(); k++) {
                if(a.get(j) == a.get(k)){
                    res.add(a.get(j));
                }
            }
        }

        for (int l = 0; l < res.size(); l++){
            System.out.print(res.get(l) + " ");
        }
    }
}
