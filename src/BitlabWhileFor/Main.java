package BitlabWhileFor;

public class Main {
    public static void main(String[] args) {

        int distance = 2703;
        int time = 5;
        double v = (double) distance/time; // (double) w/o roundup - casting. если хоть одно число дробное будет дробное, кастинг можно отпустить

        System.out.println(v + " km per day");
    }
}
