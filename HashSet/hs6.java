package HashSet;
import java.util.HashSet;
import java.util.Scanner;

public class hs6 {
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
            res += countVowel(s);
        }
        System.out.println(res);
    }
    public static int countVowel(String s){
        int count = 0;
        String st = s.toLowerCase();
        for (int i = 0; i < st.length(); i++) {
            if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}
