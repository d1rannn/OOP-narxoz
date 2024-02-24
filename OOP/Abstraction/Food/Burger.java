package OOP.Abstraction.Food;

public class Burger extends Food {
    private int meatAmount;  // количество мяса; 1,2 или 3
    private int meatType;  // тип мяса, 1 - это говядина, 2 - это курица.

    public Burger(String name, int meatAmount, int meatType) {
        super(name);
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    public Burger() {
        this.meatAmount = 0;
        this.meatType = 0;
    }

    public int getMeatAmount() {
        return meatAmount;
    }

    public void setMeatAmount(int meatAmount) {
        this.meatAmount = meatAmount;
    }

    public int getMeatType() {
        return meatType;
    }

    public void setMeatType(int meatType) {
        this.meatType = meatType;
    }

    public double getCalories(){
        if (meatType == 1){
            return meatAmount * 840;
        } else return meatAmount * 560;
    }
}
