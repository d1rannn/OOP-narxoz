package OOP.Interface.Animal;

class Cat implements Animal
{
    protected String name;
    protected int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
        this.name = "";
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

    public boolean isKitten(){
        if(age < 1){
            return true;
        } else return false;
    }

    public String getSound(){
        return "Meow!";
    }

}
