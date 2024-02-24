package StreamAPI.CarCity;
import java.util.*;
import java.util.stream.*;

public class CarCity
{
    private ArrayList<Car> cars = new ArrayList<>();

    public CarCity(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public Car firstGreatVolumeCar(){
        return cars.stream()
                .filter(car -> car.getEngineVolume() > 3.0)
                .findFirst()
                .orElse(null);
    }

    public ArrayList<Car> search(String name){
        return cars.stream()
                .filter(car -> car.getName().equals(name))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Car> filterCars(int fromSpeed, int toSpeed, double fromVolume, double toVolume){
        return cars.stream()
                .filter(car -> car.getEngineVolume() >= fromVolume && car.getEngineVolume() <= toVolume)
                .filter(car -> car.getMaxSpeed() >= fromSpeed && car.getMaxSpeed() <= toSpeed)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
