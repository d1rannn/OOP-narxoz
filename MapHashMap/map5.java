package MapHashMap;
import java.util.*;

public class map5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Character> letter = new HashSet<>();
        String text = in.nextLine();
        HashMap<Character,Integer>sumOfOccurce = new HashMap<>();
        List<Character> chars = new ArrayList<>();
        for (char c : text.toCharArray()) {
            chars.add(c);
        }
        for(int i = 0; i<chars.size();i++) {
            sumOfOccurce.put(chars.get(i),countWords(chars, chars.get(i) ));
        }
        for(char s : sumOfOccurce.keySet()){
            System.out.printf("'%c' occurs %d times\n",s,sumOfOccurce.get(s));
        }
    }
    public static int countWords(List<Character> array, char letters ) {
        return Collections.frequency(array, letters);
    }

}
