package BitlabGenerics;

public class Pair <A, B>{
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first=first;
        this.second=second;
    }
    public A getFirst() {
        return first;
    }
    public B getSecond() {
        return second;
    }
    public void setFirst(A first){
        this.first=first;
    }
    public void setSecond(B second){
        this.second=second;
    }
}
class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(29926, "Zhansaya");
        System.out.println("Value -> "+ pair.getFirst());
        System.out.println("Value -> "+ pair.getSecond());
        Pair<String, Double> pair1 = new Pair<>("Cat1", 26.5);
        Pair<String, Integer> pair2 = new Pair<>("Dog1", 29930);
        System.out.println("first value -> " + pair1.getFirst());
        System.out.println("second value -> " + pair1.getSecond());
        System.out.println("first value -> " + pair2.getFirst());
        System.out.println("second value -> " + pair2.getSecond());
    }

}
