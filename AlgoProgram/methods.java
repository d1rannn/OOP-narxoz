package AlgoProgram;

import java.util.Locale;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {}

    //method1
//    public static int getMax(int a, int b, int c){
//        int max = 0;
//        if (a > b && a > c){
//            max = a;
//        } else if (b > a && b > c) {
//            max = b;
//        } else if (c > a && c > b) {
//            max = c;
//        }
//        return max;
//    }

    //method2
//    public static String triangle(int a, int b, int c){
//        String result = "";
//        if (a + b > c && a + c > b && b + c > a){
//            result = "YES";
//        } else {
//            result = "NO";
//        }
//        return result;
//    }

    //method3
//    public static int check(String str, char letter){
//        int count = 0;
//        String str_lowerCase = str.toLowerCase();
//        for (int i = 0; i < str.length(); i++){
//            if(str_lowerCase.charAt(i) == letter){
//                count++;
//            }
//        }
//        return count;
//    }

    //method4
//    public static String palindrome(String str){
//        StringBuilder sb = new StringBuilder(str);
//        sb.reverse();
//        String result = sb.toString();
//        String polindrome = "";
//        if (str.equalsIgnoreCase(result)){
//            polindrome = "YES";
//        } else polindrome = "NO";
//        return polindrome;
//    }

    //method5
//    public static void contains(String s1, String s2){
//        if(s1.contains(s2)){
//            System.out.println("YES");
//        }else System.out.println("NO");
//    }

    //method6
//    public static String check(String login, String password){
//        String result = "";
//        if("admin".equalsIgnoreCase(login) && "qwerty".equalsIgnoreCase(password)){
//            result = "Authentication completed";
//        } else result = "Invalid login or password";
//        return result;
//    }

    //method7
//    public static double getAverage(int array[]){
//        double sum = 0;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                sum += array[i];
//                count++;
//            }
//        }
//        double avg = sum/count;
//        return avg;
//    }

    //method8
//    public static void replace(int array[][]){
//        int[] temp = array[0];
//        array[0] = array[array.length - 1];
//        array[array.length - 1] = temp;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    //method9
//    public static void show(int array[]){
//        int count = 0;
//        for (int i = 0; i < array.length; i++){
//            if(array[i] == 23) {
//                count+=i;
//                break;
//            }
//        }
//        for (int i = 0; i < count + 1; i++){
//            if (array[i] % 2 != 0){
//                System.out.println(array[i] + " ");
//            }
//        }
//    }

    //method10
//    public static int getSum(int array[]){
//        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            if (array[i] % 5 != 0){
//                sum+=array[i];
//            }
//        }
//        return sum;
//    }

    //method11
//    public static String isEven(int num){
//        String result = "";
//        if(num % 2 == 0){
//            result = "YES";
//        } else result = "NO";
//        return result;
//    }

    //method12 not ended
//    public static void redouble(String str) {
//        StringBuilder sb = new StringBuilder();
//        for (Character c : str.toCharArray()) {
//            sb.append(c);
//            if (Character.isLetter(c)) {
//                sb.append(c);
//            }
//        }
//        str = sb.toString();
//        System.out.print(str);
//    }

    //method13
//    public static int countVowels(String str){
//        int countVowels = 0;
//        String s = str.toLowerCase();
//        for (int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
//                countVowels++;
//            }
//        }
//        return countVowels;
//    }

    //method14
//    public static int count(int[] array){
//        int count = 0;
//        for (int i = 0; i < array.length; i++){
//            if (array[i] != 0){
//                count++;
//            }
//        }
//        return count;
//    }

    //method16
//    public static void printUniqueElements(int[] array) {
//        boolean bool = true;
//        for(int i = 0; i<array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i != j && array[i] == array[j]) {
//                    bool = false;
//                    break;
//                }
//            }
//            if (bool) {
//                System.out.print(array[i] + " ");
//            }
//            bool = true;
//        }
//
//    }

    //method16
//    public static void printMinAndMax(int[] array){
//        int max = 0;
//        int min = array[0];
//
//        for (int i = 0; i < array.length; i++){
//            if(max < array[i]){
//                max = array[i];
//            }
//        }
//        for (int i = 0; i < array.length; i++){
//            if(min > array[i]){
//                min = array[i];
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
//    }

    //method17
//    public static double operate(int a, int b, char c){
//        double n = 0;
//        switch (c) {
//            case '+':
//                n = a + b;
//                break;
//            case '-':
//                n = a - b;
//                break;
//            case '*':
//                n = a * b;
//                break;
//            case '/':
//                n = a / b;
//                break;
//            default:
//                break;
//        }
//        return n;
//    }

    //method18
//    public static void printMax(int[][] array){
//        int max = 0;
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                if(max < array[i][j]){
//                    max = array[i][j];
//                }
//            }System.out.println(max);
//            max = 0;
//        }
//    }

    //method19
//    public static void check(int[] array){
//        for (int i = 0; i < array.length; i++){
//            if (array[i] % 5 == 0 && array[i] < 50){
//                System.out.println(array[i]);
//            }
//        }
//    }

    //method20
//    public static String getSeason(int m){
//        String season = "";
//        switch (m){
//            case 12:
//                season = "Winter";
//                break;
//            case 1:
//                season = "Winter";
//                break;
//            case 2:
//                season = "Winter";
//                break;
//
//            case 3:
//                season = "Spring";
//                break;
//            case 4:
//                season = "Spring";
//                break;
//            case 5:
//                season = "Spring";
//                break;
//
//            case 6:
//                season = "Summer";
//                break;
//            case 7:
//                season = "Summer";
//                break;
//            case 8:
//                season = "Summer";
//                break;
//
//            case 9:
//                season = "Autumn";
//                break;
//            case 10:
//                season = "Autumn";
//                break;
//            case 11:
//                season = "Autumn";
//                break;
//
//
//        }
//        return season;
//    }


}

