package BitlabWhileFor;
/*
* Напишите программу, которая запрашивает числа. Программа должна остановиться запрашивать, когда мы вводим 0. Программа должна вывести максимальное значение из всех чисел.

Ввод:
1 2 3 4 5 0
Вывод:
5

Ввод:
26 7 2 9 12 4 0
Вывод:
26*/
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = in.nextInt();
        while (true) {
            int n = in.nextInt();
            if (max < n)
                max = n;
            if (n == 0) {
                break;
            }
        }
        System.out.println(max);
    }
}

