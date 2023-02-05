package BitlabTryCatch;
/*#3
* Пользователь вводит 2 числа. Выведите результат деление первого числа на второе. Иначе выведите “Division by zero”
Ввод:
4
2
Вывод:
2
Ввод:
5
0
Вывод:
Division by zero*/
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int result;
        try {
            a = in.nextInt();
            b = in.nextInt();
            result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");

        }

    }
}
