package AlgoProgram;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        //str1
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        int lenght = str.length();
//        System.out.println(lenght);

        //str2
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        System.out.println(str.charAt(0));

        //str3
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        if(str.equals("BITLAB")){
//            System.out.println("YES");
//        } else{
//            System.out.println("NO");
//        }

        //str4
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        if("java".equalsIgnoreCase(str)){
//            System.out.println("YES");
//        } else{
//            System.out.println("NO");
//        }

        //str5
//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        if(str1.equalsIgnoreCase(str2)){
//            System.out.println("THEY ARE EQUAL");
//        } else{
//            System.out.println("THEY ARE NOT EQUAL");
//        }

        //str6
//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//        if(str1.contains(str2)){
//            System.out.println(str1.indexOf(str2));
//        } else {
//            System.out.println("THERE IS NO SUCH LETTER");
//        }

        //str7
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        String s_trimed = s.trim();
//        StringBuilder sb = new StringBuilder(s_trimed);
//        sb.insert(0, '(');
//        sb.append(')');
//        s = sb.toString();
//        System.out.println(s);


        //str8
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        switch(str){
//            case "zero":
//                System.out.println("0");
//                break;
//            case "one":
//                System.out.println("1");
//                break;
//            case "two":
//                System.out.println("2");
//                break;
//            case "three":
//                System.out.println("3");
//                break;
//            case "four":
//                System.out.println("4");
//                break;
//            case "five":
//                System.out.println("5");
//                break;
//            case "six":
//                System.out.println("6");
//                break;
//            case "seven":
//                System.out.println("7");
//                break;
//            case "eight":
//                System.out.println("8");
//                break;
//            case "nine":
//                System.out.println("9");
//                break;
//            default:
//                break;
//        }

        //str9
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
//        for(int i = 0; i < str.length(); i++){
//            System.out.println(str.charAt(i));
//        }

        //str10
//        Scanner scan = new Scanner(System.in);
//        String s = scan.nextLine();
//
//        StringBuilder sb = new StringBuilder();
//        for (Character c: s.toCharArray()){
//            sb.append(c);
//
//            if(Character.isLetter(c)){
//                sb.append(c);
//            }
//        }
//        s = sb.toString();
//        System.out.println(s);

        //str11
//        Scanner scanner = new Scanner(System.in);
//        String str1 = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        String strLowerCase = str1.toLowerCase();
//        char letter = str2.charAt(0);
//        int countLetters = 0;
//        for(int i = 0; i < str1.length(); i++){
//            if(strLowerCase.charAt(i) == letter){
//                countLetters++;
//            }
//        }
//        System.out.println(countLetters);

        //str12
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        char letter = 'a';
//        String str_result = new String();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == letter) {
//                str_result = str.replace('a', 'o');
//            }
//        }
//        System.out.println(str_result);


        //str13
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String reversedString = sb.toString();
//        System.out.println(reversedString);

        //str14
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        String s_sub = in.nextLine();
//        if(s.contains(s_sub)){
//            System.out.println("YES");
//        } else{
//            System.out.println("NO");
//        }

        //str15
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        int countVowels = 0;
//        for (int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
//                countVowels++;
//            }
//        }
//        System.out.println(countVowels);


        //str16
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        int result = 0;
//        for (int i = 0; i < s.length(); i++){
//            if(Character.isDigit(s.charAt(i))){
//                result+=Character.getNumericValue(s.charAt(i));
//            }
//        }
//        System.out.println(result);


        //str17
//        Scanner in = new Scanner(System.in);
//        String s1 = in.nextLine();
//        String s2 = in.nextLine();
//        StringBuilder sb2 = new StringBuilder(s2);
//        sb2.reverse();
//        s2 = sb2.toString();
//        if(s1.equals(s2)){
//            System.out.println("Yes");
//        } else{
//            System.out.println("No");
//        }

        //str18
//        Scanner in = new Scanner(System.in);
//        String s1 = in.nextLine();
//        String s2 = in.nextLine();
//        StringBuilder sb2 = new StringBuilder(s2);
//        sb2.reverse();
//        s2 = sb2.toString();
//        if(s1.equals(s2)){
//            System.out.println("Yes");
//        } else{
//            System.out.println("No");
//        }

        //str19
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        int i = Integer.parseInt(String.valueOf(s.charAt(0)));
//        i *=2;
//        s = s.charAt(1)+Integer.toString(i);
//        System.out.println(s);

        //str20
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        String s = in.next();
//        int b = in.nextInt();
//        int n = 0;
//        switch (s) {
//            case "+":
//                n = a + b;
//                break;
//            case "-":
//                n = a - b;
//                break;
//            case "*":
//                n = a * b;
//                break;
//            case "/":
//                n = a / b;
//                break;
//            default:
//                break;
//        }
//        System.out.println(n);

        //str21
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        StringBuffer new_s = new StringBuffer(s);
//
//        for(int i = 0; i < s.length(); i++) {
//            if(Character.isLowerCase(s.charAt(i))) {
//                new_s.setCharAt(i, Character.toUpperCase(s.charAt(i)));
//            }
//            else if(Character.isUpperCase(s.charAt(i))) {
//                new_s.setCharAt(i, Character.toLowerCase(s.charAt(i)));
//            }
//        }
//        System.out.println(new_s);

        //str22
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        String s_result = "";
//        for(int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//            if(Character.isDigit(c)){
//                c = '0';
//            }
//            s_result+=c;
//        }
//        System.out.println(s_result);

        //str23
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        int count = 0;
//        for (int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//            if(Character.isAlphabetic(c)){
//                count++;
//            }
//        }
//        System.out.println(count);

        //str24
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        StringBuilder s_result = new StringBuilder();
//        String[] sArr = s.split("\\s+");
//        for (String word : sArr) {
//            s_result.append(Character.toUpperCase(word.charAt(0)));
//            if (word.length() > 1) {
//                s_result.append(word.substring(1));
//            }
//            s_result.append(" ");
//        }
//        System.out.println(s_result.toString().trim());

        //str25*
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//
//        String result = "";
//        char bracket1 = '<';
//        char bracket2 = '>';
//
//        boolean bool = false;
//
//        for (int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == bracket1 || s.charAt(i) == bracket2){
//                bool = !bool;
//            } else if (bool) {
//                result+=s.charAt(i);
//            }
//        }
//        result = result.replaceAll("\\s+", " ");
//        result = result.trim();
//        System.out.println(result);

        //str26*
//        Scanner in = new Scanner(System.in);
//        String text = in.nextLine();
//        String[] words = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
//        int[] numbers = {0,1, 2, 3, 4,5,6,7,8,9};
//
//        for (int i = 0; i < words.length; i++) {
//            text = text.replaceAll("(?i)" + words[i], String.valueOf(numbers[i]));
//        }
//
//        System.out.println(text);


        //str27*
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        String [] number = s.split(" ");
//        double First = Double.parseDouble(number[0]);
//        double Second = Double.parseDouble(number[2]);
//        double Third = Double.parseDouble(number[4]);
//        String operator  = number[1];
//        String operator2 = number[3];
//        double result = 0.0;
//        switch (operator) {
//            case "+":
//                result = First + Second;
//                break;
//            case "-":
//                result = First - Second;
//                break;
//            case "*":
//                result = First * Second;
//                break;
//            case "/":
//                result = First / Second;
//                break;
//            default:
//        }
//        switch (operator2){
//            case "+":
//                result+=Third;
//                System.out.println((int)result);
//                break;
//            case "-":
//                result -=Third;
//                System.out.println((int)result);
//                break;
//            case "*":
//                if(operator.equals("+") ){
//                    result = Second*Third;
//                    result+=First;
//                }
//                else if(operator.equals("-")){
//                    result = Second*Third;
//                    result-=First;}
//                if(operator.equals("/") || operator.equals("*")){ result *=Third;}
//                System.out.println((int)result);
//                break;
//
//            case "/":
//                result /=Third;
//                System.out.println((int)result);
//                break;
//            default:
//        }

        //str28*


    }
}
