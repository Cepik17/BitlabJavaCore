package BitlabGenerics;
/*#2
* Создайте класс Pair<A, B>, который может хранить пару объектов.
Создайте конструкторы с параметрами (Pair(A first, B second))
Создайте методы A getFirst() и B getSecond() которые возвращают первые и вторые элементы соответственно
Создайте методы void setA(A first) и void setB(B second) которые возвращают первые и вторые элементы соответственно*/
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
