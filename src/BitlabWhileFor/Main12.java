package BitlabWhileFor;
/*
Напишите программу, которая запрашивает дробные числа (double d). Программа должна остановиться запрашивать, когда мы вводим 0. Программа должна вывести умножение всех введенных чисел.
*
Ввод:
3.1 2.4 1.2 0
Вывод:
8.928
*/

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mult = 1;
        while (true) {
            double d = in.nextDouble();
            if (d != 0)
                mult = mult * d;
            else
                break;
            }
        System.out.println(mult);
        }
    }

