package OOP.Abstraction.Food;

abstract class Food{
    // создайте параметр name
    // создайте конструкторы (с параметром и по умолчанию)
    // создайте геттер и сеттер для параметра name
    // добавьте абстрактный метод getCalories(), который возвращает количество калорий

    protected String name;

    public Food(String name){
        this.name = name;
    }

    public Food(){
        this.name = "";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract double getCalories();
}
