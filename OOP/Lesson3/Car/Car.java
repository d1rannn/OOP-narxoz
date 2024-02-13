package OOP.Lesson3.Car;

public class Car
{
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String ride(){
        return "Car "+name+" with "+maxSpeed+" from "+year+" year with engine volume "+volume+" litters is riding.";
    }
}
