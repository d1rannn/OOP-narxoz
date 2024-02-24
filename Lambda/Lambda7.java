package Lambda;
import java.util.*;

public class Lambda7
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<>();
        while (true){
            String input = in.nextLine();
            if(input.equals("exit")){
                break;
            } else ar.add(input);
        }

        Collections.sort(ar, (ar1, ar2) -> ar1.length() > ar2.length() ? 1 : ar1.length() == ar2.length() ? 0 : -1);
        System.out.println(ar);
    }
}
