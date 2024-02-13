package AlgoProgram;

import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = recursiveSum(arr, n);
        System.out.println(result);

    }

        public static int recursiveSum(int[] arr, int n) {
            if (n == 0) {
                return 0;
            } else {
                return recursiveSum(arr, n - 1) + arr[n - 1];
            }
        }
}


//recursion3
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String text = in.nextLine();
//        System.out.println(reverse(text, text.length() - 1));
//    }
//
//    public static String reverse(String text, int index) {
//        if (index == -1) return "";
//        return  text.charAt(index) + reverse(text, index - 1);
//    }