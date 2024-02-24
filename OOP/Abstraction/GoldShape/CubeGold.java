package OOP.Abstraction.GoldShape;

public class CubeGold extends GoldShape{
    private double side;

    public CubeGold(double side) {
        this.side = side;
    }

    public CubeGold() {
        this.side = 0.0;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getVolume(){
        return Math.pow(side, 3);
    }
}
