package BitlabWhileFor;
/*Программа должна запрашивать два целых числа (int n и int m) и показать количество ЧЕТНЫХ чисел в промежутке от n до m.
*Подсказка: создайте дополнительную переменную int count = 0 которая увеличиваться на 1 если число будет ЧЕТНЫМ

Ввод:
1 5
Вывод:
2


Ввод:
5 10
Вывод:
3*/
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count =0;
        for (int i = n; i <= m; i++){
            if (i%2==0){
                count = count + 1;
            }

        }
        System.out.println(count);

    }
}
