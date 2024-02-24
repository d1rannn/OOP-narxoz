package StreamAPI;
import java.util.*;
import java.util.stream.*;

public class Car
{
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static ArrayList<Car> getCarsAfterYear(ArrayList<Car> cars, int year){
        return (ArrayList<Car>) cars.stream()
                .filter(car -> car.getYear() > year)
                .collect(Collectors.toList());
    }
}
