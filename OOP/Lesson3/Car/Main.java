package OOP.Lesson3.Car;

public class Main
{
    public static void main(String[] args) {
        Toyota t = new Toyota("Name", "Camry", 120, 2021, 90.2, "manu");
        String res = t.ride();
        System.out.println(res);
    }
}
