package OOP.Interface.Animal;

class Dog implements Animal
{
    protected String name;
    protected String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog() {
        this.name = "";
        this.breed = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSound(){
        return "Woof!";
    }
}
