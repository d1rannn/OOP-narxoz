package TryCatch;
import java.util.Scanner;

public class Task2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int denom;
        int div;

        try{
            num = in.nextInt();
            denom = in.nextInt();
            div = num/denom;
            System.out.println(div);
        } catch(ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
