package BitlabLyambda;
/*#1
* Создайте интерфейс - Operator.java у которого есть абстрактные методы:

int toOperate(int a, int b) - данный метод с двумя числами a и b, и возвращает результат

Создайте отдельный класс SumOperation.java который имеет метод:

int getSum(int a, int b) - данный метод суммирует два числа a и b, и возвращает результат.
Но, обратите внимание на то что это класс а не интерфейс.
Данный метод getSum(int a, int b) при суммировании должен использовать интерфейс Operator.java а точнее его метод toOperate(int a, int b).
* Используйте лямбда выражения (для реализации метода toOperate(int a, int b)) при суммировании двух чисел.*/

public class SumOperation {
    Operator operate = (a, b) -> a + b;

    int getSum(int a, int b) {
        return operate.toOperate(a, b);
    }

}
class Test {
    public static void main(String[] args) {
        SumOperation sumOperation = new SumOperation();
        Operator operator = (a, b) -> sumOperation.getSum(a, b);
        System.out.println("Sum: " + operator.toOperate(15, 25));
    }
}

