package BitlabWhileFor;
/*
* Напишите программу, в которой я ввожу число n. Программа должна вывести умножение первых n чисел. То есть 1*2*3*4*5...n.
Ввод:
3
Вывод:
6
Ввод:
5
Вывод:
120*/
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            mult = mult * i;
        }
        System.out.println(mult);
    }
}
