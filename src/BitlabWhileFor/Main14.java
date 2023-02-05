package BitlabWhileFor;
/*Вводятся 4 числа: int a, int b, int c и int d. Выведите все числа на отрезке от a до b, дающие остаток c при делении на d. Если таких чисел не существует, то ничего выводить не нужно.

Ввод:
2 5 0 2
Вывод:
2 4

Ввод:
3 30 2 5
Вывод:
7 12 17 22 27*/
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int i = a;
        while (i <= b) {
            if (i % d == c)
                System.out.println(i + " ");
            i++;
        }
    }
}
