package BitlabGenerics;
/*#3
* Создайте класс Swap<A, B>, который меняет местами значения двух переменных. У него будут методы:
void setFirst(A first) - метод задает первый элемент
void setSecond(B second) - метод задает второй элемент
void getFirst() - метод возвращает первый элемент
void getSecond() - метод задает возвращает элемент
void swap() - метод меняет местами первый и второй элемент (меняет значения)*/
public class Swap<A, B> {
    private A first;
    private B second;

    public Swap() {
    }

    public Swap(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(A first) { // -метод задает первый элемент
        this.first = first;
    }

    public void setSecond(B second) {
        this.second = second;
    }//- метод задает второй элемент

    public A getFirst() {
        return first;
    } //- метод возвращает первый элемент

    public B getSecond() {
        return second;
    }// - метод  возвращает элемент

    public void swap(){
//            String s1 = A.getFirst();
//            // Do something with the string...here we will print it
//            System.out.println(objectString);
        A temp;
        temp =first;
        first = (A)second;
        second = (B)temp;
    } //- метод меняет местами первый и второй элемент (меняет значения)
}
