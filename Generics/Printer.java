package Generics;

public class Printer<T>
{
    T value;
    public Printer() {
        this.value = value;
    }

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void printValue(){
        System.out.println("Value is " + value);
    }
    public void refresh(){
        value = null;
    }
}