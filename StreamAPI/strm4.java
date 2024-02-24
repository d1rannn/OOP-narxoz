package StreamAPI;
import java.util.*;
import java.util.stream.*;

public class strm4
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(i);
        for (int j = 0; j < i; j++) {
            nums.add(in.nextInt());
        }
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        System.out.println(max.get());
    }
}
