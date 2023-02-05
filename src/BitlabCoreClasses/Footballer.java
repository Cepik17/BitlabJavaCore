package BitlabCoreClasses;

public class Footballer extends Sportsman {
    String position;
    String club;

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }
    public Footballer() {
    }
    @Override
    public String play() {
        return "Footballer " + fullName + " from " + country + ", " +age +" years old " + position
        + " is playing for " + club;
    }
}
