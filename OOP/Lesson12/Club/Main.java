package OOP.Lesson12.Club;
import OOP.Lesson12.Player.Player;

public class Main
{
    public static void main(String[] args) {
        Player p1 = new Player (7, "Cristiano", "Ronaldo", "ST");
        Player p2 = new Player (10, "Luka", "Modric", "LW");

        Player [] players = new Player[2];
        players[0] = p1;
        players[1] = p2;

        Club club = new Club("Real Madrid", "Portugal", 95, players);

        club.printClubData();
    }
}
