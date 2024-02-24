package Generics;

public class Main
{
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>();
        printer.setValue(23);
        printer.printValue();
    }
}
