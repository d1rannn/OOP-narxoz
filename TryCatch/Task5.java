package TryCatch;

import java.util.Scanner;

public class Task5
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //пишите код сюда
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            String x = in.next();
            try {
                arr[i] = Integer.parseInt(x);
            } catch (Exception e){
                arr[i] = 0;
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += arr[i];
        }
        System.out.println(result);
    }
}
