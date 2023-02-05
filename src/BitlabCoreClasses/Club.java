package BitlabCoreClasses;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player []players;

    public Club() {
        this.name = "noname";
        this.country = "noname";
        this.ratingPoints = 0;
        this.players = null;
    }

    public Club(String name, String country, int ratingPoints, Player []players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData() {
        System.out.println("Name: "+ name + " Country: " + country + " RatingPoints: " + ratingPoints + " Players: ");
        for (int i =0; i < players.length; i++)
            System.out.println(players[i]);
    }
}
class ClubTEst {
    public static void main(String[] args) {

        Player player1 = new Player(9, "Karim", "Benzema", "attack");
        Player player2 = new Player(7, "Cristaino", "Rodaldo", "attack");
        Player player3 = new Player(10, "Messi", "Lionel", "attack");
        Player player4 = new Player(5, "Didar", "Oliver", "defender");
        Player player5 = new Player(10, "Micheal", "Owen", "atack");
        Player player6 = new Player(5, "Zinedin", "Zidan", "atack");
        Player player7 = new Player(5, "Sergio", "Ramos", "defender");
        Player player8 = new Player(7, "Luis", "Figo", "atack");
        Player player9 = new Player(3, "Ronald", "Couman", "defender");
        Player player10 = new Player(8, "Xavi", "Xavi", "atack");


        Player[] players1 = {player1,player2,player5,player6,player7};
        Player[] players2 = {player3,player4,player8,player9,player10};


        Club club1 = new Club("Real Madrid", "Spain", 100, players1);
        Club club2 = new Club("Barcelona", "Spain", 98, players2);

        Club[] clubs = {club1,club2};

        for (int i = 0; i < clubs.length; i++) {
            clubs[i].printClubData();
        }
    }
}