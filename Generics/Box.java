package Generics;
import java.util.*;

public class Box <T>
{
    private List<T> contents = new ArrayList<>();
    public Box() {
        contents = new ArrayList<>();
    }

    public Box(List<T> initialContents) {
        contents = new ArrayList<>(initialContents);
    }

    public void add(T item) {
        contents.add(item);
    }

    public List<T> getContents() {
        return contents;
    }
}
