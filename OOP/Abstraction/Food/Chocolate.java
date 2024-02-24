package OOP.Abstraction.Food;

public class Chocolate extends Food {
    // создайте параметры
    // создайте конструкторы
    // создайте геттеры и сеттеры
    // переопределить абстрактный метод getCalories()

    private int weight;

    public Chocolate(String name, int weight){
        super(name);
        this.weight = weight;
    }

    public Chocolate(){
        this.weight = 0;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public double getCalories(){
        return weight * 740;
    }
}
