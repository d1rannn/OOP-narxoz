package TryCatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //пишите код сюда
        while (true) {
            try {
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                int sum = num1 + num2;
                System.out.println("Sum of numbers: " + sum);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid data entered. Try again");
                in.nextLine();
            }
        }
    }
}
