package OOP.Abstraction.GoldShape;

public class SphereGold extends GoldShape
{
    private double radius;

    public SphereGold(double radius) {
        this.radius = radius;
    }

    public SphereGold(){
        this.radius = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume(){
        return (4 * 3.14 * Math.pow(radius, 3))/3;
    }
}
