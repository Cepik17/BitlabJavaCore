package BitlabCoreClasses;

public class Sportsman {
    String fullName;
    int age;
    String country;

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public Sportsman() {
    }
    public String play(){
        return "Sportsman " + fullName + " from " + country + " " +age +" years old is playing";
    }
}
class SportsmanTest {
    public static void main(String[] args) {
        Gymnast sportsman1 = new Gymnast("Zhansaya Kulbaeva", 20, "Kazakhstan", 170, 50, "Sports");
        sportsman1.fullName = "Zhansaya Kulbaeva";
        sportsman1.age = 20;
        sportsman1.country = "Kazakhstan";
        sportsman1.height = 170;
        sportsman1.weight = 50;
        sportsman1.style = "sports";

        System.out.println("The best player ->");
        System.out.println(sportsman1.play());
    }
}
