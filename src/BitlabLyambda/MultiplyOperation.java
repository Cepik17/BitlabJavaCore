package BitlabLyambda;
/*#2
* Продолжайте работать с интерфейсом Operator.java.
Создайте отдельный класс MultiplyOperation.java который имеет метод:
int getMultiplication(int a, int b) - данный метод умножает два числа a и b, и возвращает результат.
* Используйте лямбда выражения (для реализации метода toOperate(int a, int b)) при умножении двух чисел.*/
public class MultiplyOperation {
    Operator operate = (a, b) -> a * b;
    int getMultiplication(int a, int b){
        return operate.toOperate(a,b);
    }
}
class Test2 {
    public static void main(String[] args) {
        MultiplyOperation multiplyOperation = new MultiplyOperation();
        Operator operator = (a, b) -> multiplyOperation.getMultiplication(a,b);
        System.out.println("-> " + operator.toOperate(11,61));
    }
}
