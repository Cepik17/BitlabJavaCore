package BitlabWhileFor;
/* Напишите программу, которая запрашивает числа. Программа должна остановиться запрашивать, когда мы вводим 0. Программа должна вывести среднее значение введенных чисел.
*Подсказка: Пропишите в условии цикла ВВОДИМОЕ ЦИСЛО!=0

Ввод:
1 2 3 4 5 0
Вывод:
3.0

Ввод:
26 7 2 9 12 4 0
Вывод:
10.0*/
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true) {
            int n = in.nextInt();
            sum = sum + n;
            count = count + 1;
            if (n == 0) {
                break;
            }

        }
        System.out.println(sum / (count - 1));

    }

}
