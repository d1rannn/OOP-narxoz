package HashSet;
import java.util.*;

public class hs1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>(10);
        for (int i = 0; i < 10; i++) {
            String s = in.nextLine();
            hs.add(s);
        }
        System.out.println(hs.size());
    }
}
