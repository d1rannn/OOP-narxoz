package AlgoProgram;

import java.util.Scanner;

public class arraysOneDimensional {
    public static void main(String[] args){
        //arr2
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];

//        for(int i = 0; i < nums.length; i++){
//            nums[i] = scanner.nextInt();
//        }

//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }

        //arr3
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//
//        for(int i = 0; i < nums.length; i++){
//            nums[i] = scanner.nextInt();
//        }
//
//        for(int i = 0; i < nums.length; i++){
//            System.out.println(i + " - " + nums[i]);
//        }

        //arr4
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > 0) {
//                count++;
//            }
//        }
//
//        int[] positive = new int[count];
//        int posIdx = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > 0) {
//                positive[posIdx] = nums[i];
//                posIdx++;
//            }
//        }
//
//        for (int i = 0; i < count; i++) {
//            System.out.println(positive[i]);
//        }

        //arr5
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] % 2 == 0) {
//                count++;
//            }
//        }
//
//        int[] result = new int[count];
//        int resultInd = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (nums[i] % 2 == 0) {
//                result[resultInd] = nums[i];
//                resultInd++;
//            }
//        }
//
//        for (int i = 0; i < count; i++) {
//            System.out.println(result[i]);
//        }

        //arr6
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int[] nums = new int[n];
//
//        for (int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < n; i++){
//            System.out.print(nums[i] * nums[i] + " ");
//        }

        //arr7
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//
//        for(int i = 0; i < n; i+=2){
//            System.out.print(nums[i] + " ");
//        }

        //arr8
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//
//        for(int i = 1; i < n; i+=2){
//            System.out.print(nums[i] + " ");
//        }


        //arr9
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > 0) {
//                count++;
//            }
//        }
//
//        int[] result = new int[count];
//        int resultInd = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > 0) {
//                result[resultInd] = nums[i];
//                resultInd++;
//            }
//        }
//        System.out.println(result.length);

        //arr10
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//
//        for(int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//
//        int count = 0;
//        for (int i = 0; i < n; i++){
//            count+=nums[i];
//        }
//
//        System.out.println(count);

        //arr11
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//
//        for(int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//
//        double total = 0;
//        for (int i = 0; i < n; i++){
//            total+=nums[i];
//        }
//
//        int count = 0;
//        for(int i = 0; i < n; i++){
//            count++;
//        }
//        double avg = total / count;
//
//        System.out.print((int)total);
//        System.out.print(" " + avg);

        //arr12
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        int a = 0;
//        int b = 0;
//
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//            if(nums[i] % 2 == 0){
//                a+=nums[i];
//                b++;
//            }
//        }
//        System.out.println((double)a/b);

        //arr13
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        int a = 0;
//        int b = 0;
//
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//            if(nums[i] < 0){
//                a+=nums[i];
//                b++;
//            }
//        }
//        System.out.println((float)a/b);

        //arr14
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            numbers[i] = input.nextInt();
//        }
//
//        double sum = 0;
//        for (int num : numbers) {
//            sum += num;
//        }
//        double average = sum / n;
//
//        for (int num : numbers) {
//            if (num > average) {
//                System.out.print(num + " ");
//            }
//        }

        //arr15
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for(int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//
//        int multi = 1;
//        for(int i = 0; i < n; i++){
//            if(nums[i] != 0){
//                multi*=nums[i];
//            }
//        }
//        System.out.println(multi);

        //arr16
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for(int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//
//        int k = scanner.nextInt();
//        for(int i = 0; i < n; i++){
//            if(nums[i] % k == 0){
//                System.out.print(nums[i] + " ");
//            }
//        }
//        System.out.println();

        //arr17
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for(int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//
//        int multi = 1;
//        for(int i = 0; i < n; i+=2){
//            if(nums[i] != 0){
//                multi*=nums[i];
//            }
//        }
//        System.out.println(multi);`

        //arr18
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for(int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//        int max = 0;
//        for (int i = 0; i < n; i++){
//            if(max < nums[i]){
//                max = nums[i];
//            }
//        }
//        System.out.println(max);

        //arr19
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for(int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//        int min = nums[0];
//        for (int i = 0; i < n; i++){
//            if(min > nums[i]){
//                min = nums[i];
//            }
//        }
//        System.out.println(min * min);

        //arr20
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for(int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//        int max = nums[0];
//        int resultIdx = 0;
//        for (int i = 0; i < n; i++){
//            if(max < nums[i]){
//                max = nums[i];
//                resultIdx = i;
//            }
//        }
//        System.out.print(max + " ");
//        System.out.print(resultIdx);

        //arr21
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for(int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//        int max = 0;
//        for (int i = 0; i < n; i++){
//            if(max < nums[i]){
//                max = nums[i];
//            }
//        }
//        int min = nums[0];
//        for (int i = 0; i < n; i++){
//            if(min > nums[i]){
//                min = nums[i];
//            }
//        }
//
//        System.out.print(min + " ");
//        System.out.print(max);

        //arr22
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for(int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//        int max = 0;
//        for (int i = 0; i < n; i++){
//            if(max < nums[i]){
//                max = nums[i];
//            }
//        }
//        int min = nums[0];
//        for (int i = 0; i < n; i++){
//            if(min > nums[i]){
//                min = nums[i];
//            }
//        }
//
//        System.out.print(max - min);

        //arr23
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//        int maxIndex = 0;
//        int minIndex = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (nums[i] > nums[maxIndex]) {
//                maxIndex = i;
//            }
//            if (nums[i] < nums[minIndex]) {
//                minIndex = i;
//            }
//        }
//
//        double sum = 0;
//        for (int i = 0; i < n; i++) {
//            if (i != maxIndex && i != minIndex) {
//                sum += nums[i];
//            }
//        }
//
//        double avg = sum / (n - 2);
//        System.out.println((int) sum);
//        System.out.println(avg);

        //arr24
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//
//        for(int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//        int m = scanner.nextInt();
//        boolean found = false;
//
//        for(int i = 0; i < n; i++) {
//            if(nums[i] == m) {
//                System.out.println("YES");
//                System.out.println(i);
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("NO");
//        }

        //arr25
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//
//        for(int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//        int m = scanner.nextInt();
//        int sum = 0;
//        int count = 0;
//        for(int i = 0; i < n; i++){
//            if(m < nums[i]){
//                sum+=nums[i];
//                count++;
//            }
//        }
//        System.out.println((float)sum/count);

        //arr26
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//
//        for (int i = n - 1; i >= 0; i--) {
//            System.out.println(numbers[i] + " ");
//        }

        //arr27
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++){
//            a[i] = in.nextInt();
//        }
//        int sum = 0;
//        boolean bzero = false;
//        for (int number : a) {
//            if (number == 0) bzero = !bzero;
//            else if (bzero) {
//                sum+=number;
//            }
//        }
//        System.out.println(sum);

        //arr28
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++){
//            nums[i] = scanner.nextInt();
//        }
//
//        for(int i = 0; i < n; i++){
//            if(nums[i] % 2 == 0){
//                System.out.print(nums[i] + " ");
//            }
//        } //просто вывел числа которые четные и все, не хотел заморачиваться со вторым массивом.

        //arr29

    }
}
