package OOP.Lesson3.Sportsman;

public class Footballer extends Sportman
{
    private String position;
    private String club;

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String play(){
        return "Sportsman "+fullName+" from "+country+" "+age+" y.o. "+position+" is playing for "+club+" ";
    }
}
