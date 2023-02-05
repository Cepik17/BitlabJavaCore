package BitlabCoreClasses;
import java.util.Scanner;

public class OlympicGames{
    String city;
    int year;
    Sportsman [] sportsmansList;

    public OlympicGames(String city, int year, Sportsman[] sportsmansList) {
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }

    public OlympicGames() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Sportsman[] getSportsmansList() {
        return sportsmansList;
    }

    public void setSportsmansList(Sportsman[] sportsmansList) {
        this.sportsmansList = sportsmansList;
    }
    public String getData(){
        return "City: " + city + " Year: " + year;
    }
}
class OlympicGamesTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sportsman [] sportsmansList = new Sportsman[6];
        sportsmansList[0] = new Gymnast(scanner.next(),scanner.nextInt(), scanner.next(), scanner.nextInt(),scanner.nextInt(), scanner.next());
        sportsmansList[1] = new Gymnast(scanner.next(),scanner.nextInt(), scanner.next(), scanner.nextInt(),scanner.nextInt(), scanner.next());
        sportsmansList[2] = new Footballer(scanner.next(),scanner.nextInt(),scanner.next(), scanner.next(),scanner.next());
        sportsmansList[3] = new Footballer(scanner.next(),scanner.nextInt(),scanner.next(), scanner.next(),scanner.next());
        sportsmansList[4] = new Swimmer(scanner.next(),scanner.nextInt(),scanner.next(), scanner.next(),scanner.nextDouble());
        sportsmansList[5] = new Swimmer(scanner.next(),scanner.nextInt(),scanner.next(), scanner.next(),scanner.nextDouble());

        for (int i = 0; i < sportsmansList.length; i++) {
            sportsmansList[i].play();
        }

    }
}
