package BitlabWhileFor;
/*Программа должна запрашивать целое число (int n) и показать сумму первых НЕЧЕТНЫХ n чисел от 1, где n является порядковым номером нечетного элемента в этой последовательности. Результат = 1 + 3 + 5 + 7 + 9 + … (n раз)
*Подсказка: создайте дополнительную переменную int k=1 к которой будет прибавляться 2 на каждом кругу, а k в свою очередь будете прибавлять к sum

Ввод:
3
Вывод:
9

Ввод:
5
Вывод:
25*/
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + (i * 2 - 1);
            i++;

        }
        System.out.println(sum);
    }


}

