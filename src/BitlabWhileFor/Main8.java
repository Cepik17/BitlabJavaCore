package BitlabWhileFor;
/*Напишите программу, которая запрашивает числа. Программа должна остановиться запрашивать, когда мы вводим 0. Программа должна вывести количество введенных чисел.
*Подсказка: Пропишите в условии цикла ВВОДИМОЕ ЦИСЛО!=0

Ввод:
1 2 3 4 5 0
Вывод:
5

Ввод:
26 7 2 9 12 4 0
Вывод:
6*/

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while (true) {
            int n = in.nextInt();
            count = count + 1;
            if (n == 0) {
                count = count - 1;
                break;
            }
        }
        System.out.println(count);

    }
}
