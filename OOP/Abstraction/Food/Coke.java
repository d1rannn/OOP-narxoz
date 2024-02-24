package OOP.Abstraction.Food;

public class Coke extends Food {
    private double volumeLiters;
    private boolean isSparkling; // Газированная или нет

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public Coke() {
        this.volumeLiters = 0.0;
        this.isSparkling = true;
    }

    public double getVolumeLiters() {
        return volumeLiters;
    }

    public void setVolumeLiters(double volumeLiters) {
        this.volumeLiters = volumeLiters;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    public void setSparkling(boolean sparkling) {
        isSparkling = sparkling;
    }

    @Override
    public double getCalories() {
        if (isSparkling){
            return volumeLiters * 400;
        } else return volumeLiters * 100;
    }
}
