package BitlabWhileFor;
/*Напишите программу которая принимает два целых числа int n и int m и выводит сумму всех ЧЕТНЫХ чисел от n до m.

Ввод:
1 3
Вывод:
2

Ввод:
5 10
Вывод:
24*/
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        for (int i = n; i <= m; i++) {
            if (i%2==0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
