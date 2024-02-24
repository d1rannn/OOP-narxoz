package OOP.Interface.Animal;

class Cow implements Animal
{
    protected String name;
    protected double weight;
    protected int age;

    public Cow(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cow() {
        this.name = "";
        this.weight = 0;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isOld(){
        if(age > 5){
            return true;
        } else return false;
    }

    public String getSound(){
        return "Moo!";
    }

}
