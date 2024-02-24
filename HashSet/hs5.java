package HashSet;
import java.util.HashSet;
import java.util.Scanner;

public class hs5
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        while (true) {
            String s = in.nextLine();
            if (s.contains("stop")) {
                break;
            } else hs.add(s);
        }
        int res = 0;
        for (String s : hs) {
            res += s.length();
        }
        System.out.println(res);
    }
}
