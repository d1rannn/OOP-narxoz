package ArrayList;
import java.util.*;

public class a10
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> firstList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            firstList.add(in.nextInt());
        }

        int m = in.nextInt();
        ArrayList<Integer> secondList= new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            secondList.add(in.nextInt());
        }

        Collections.sort(firstList);
        Collections.sort(secondList);

        System.out.println("Sorted first array:");
        for (int i = 0; i < n; i++) {
            System.out.print(firstList.get(i) + " ");
        }
        System.out.println();
        System.out.println("Sorted second array:");
        for (int i = 0; i < m; i++) {
            System.out.print(secondList.get(i) + " ");
        }
        System.out.println();

        ArrayList<Integer> thirdList = new ArrayList<>(n+m);
        thirdList.addAll(firstList);
        thirdList.addAll(secondList);

        Collections.sort(thirdList);

        System.out.println("Sorted third array:");
        for (int i = 0; i < n+m; i++) {
            System.out.print(thirdList.get(i) + " ");
        }
    }
}
