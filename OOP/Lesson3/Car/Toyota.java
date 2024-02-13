package OOP.Lesson3.Car;

public class Toyota extends Car
{
    String manufacturer;
    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String ride(){
        return "Car "+name+" with "+maxSpeed+" from "+year+" year with engine volume "+volume+" litters from "+manufacturer+" is riding.";
    }
}
