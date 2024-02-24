package HashSet;
import java.util.HashSet;
import java.util.Scanner;

public class hs8
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set1 = new HashSet<>();
        while (true) {
            String s = in.nextLine();
            if (s.contains("exit")) {
                break;
            } else set1.add(s);
        }

        HashSet<String> set2 = new HashSet<>();
        while (true) {
            String s = in.nextLine();
            if (s.contains("exit")) {
                break;
            } else set2.add(s);
        }

        HashSet<String> set = new HashSet<>();
        set.addAll(set1);
        set.addAll(set2);

        System.out.println(set);
    }
}
