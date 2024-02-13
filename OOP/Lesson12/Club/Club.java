package OOP.Lesson12.Club;
import OOP.Lesson12.Player.Player;

public class Club
{
    String name;
    String country;
    int ratingPoints;
    Player[] players;

    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData() {
        System.out.println(name + ". Country: " + country + ". Rating Points: " + ratingPoints + ". Players: ");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
    }
}
