package BitlabCoreClasses;

public class Gymnast extends Sportsman {
    int height;
    int weight;
    String style;

    public Gymnast(String fullName, int age, String country, int height, int weight,String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    public Gymnast() {
    }
    public String play(){
        //super.play();
        return "Gymnast " + fullName + " from " + country + " " +age +" years old, " + weight + " kg, " + height + " cm with workout style is " + style;
    }
}
