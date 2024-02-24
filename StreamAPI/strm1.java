package StreamAPI;
import java.util.*;
import java.util.stream.*;

public class strm1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> numList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            numList.add(num);
        }
        Stream<Integer> numStream = numList.stream();
        numStream = numStream.filter(s -> s % 2 == 0);
        numStream.forEach(s -> System.out.print(s + " "));
    }
}
