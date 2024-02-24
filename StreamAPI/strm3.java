package StreamAPI;
import java.util.*;
import java.util.stream.*;

public class strm3
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(i);
        for (int j = 0; j < i; j++) {
            nums.add(in.nextInt());
        }
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
