package OOP.InheritancePolymorphysm.Car;

public class Mercedes extends Car
{
    private String classType;
    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String ride(){
        return "Car "+name+" with "+maxSpeed+" from "+year+" year with engine volume "+volume+" litters with "+classType+" is riding.";
    }
}
