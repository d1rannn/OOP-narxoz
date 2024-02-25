package HashSet;
import java.util.HashSet;
import java.util.Scanner;

public class hs6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        while (true) {
            String s = in.next().toLowerCase();
            if (s.contains("stop")) {
                break;
            } else hs.add(s);
        }
        int res = 0;
        for (String s : hs) {
            res += countVowel(s);
        }
        System.out.println(res);
    }
    public static int countVowel(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}
