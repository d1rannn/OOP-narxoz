package OOP.Lesson12.Player;

public class Player
{
    int number;
    String name;
    String surname;
    String position;

    public Player (int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String toString() {
        return number + " " + name + " " + " " + surname + " " + " " + position;
    }
}
