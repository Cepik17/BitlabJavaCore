package BitlabWhileFor;
/*Программа запрашивает число n. Программа должна вывести сумму первых n чисел в последовательности 1+1/2+1/3+1/4...

Ввод:
3
Вывод:
1.83333

Ввод:
15
Вывод:
3.31823*/

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + ((double)1 / i);
            i++;
        }
        System.out.println(sum);
    }
}
