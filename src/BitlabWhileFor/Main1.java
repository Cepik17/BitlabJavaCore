package BitlabWhileFor;
/*Напишите программу которая принимает целое число int n и выводит сумму всех чисел от 1 до n. Результат = 1 + 2 + 3 + 4 + 5 + … + n
*Подсказка: создайте дополнительную переменную int sum=0 к которой вы будете прибавлять числа на каждом кругу цикла

Ввод:
3
Вывод:
6

Ввод:
5
Вывод:
15*/
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String s = scanner.next();
        int n = scanner.nextInt();
        //int m = scanner.nextInt();
        //int i = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
