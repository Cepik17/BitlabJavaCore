package BitlabWhileFor;
/*Программа запрашивает два целых числа (int n и int m) и выводит на экран СРЕДНЕЕ ЗНАЧЕНИЕ всех чисел от n до m. (Среднее значение вычисляется делением суммы на количество чисел)
Ввод:
3 10
Вывод:
6.5

Ввод:
5 15
Вывод:
10.0*/
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count = 0;
        double sum = 0;
        for (int i = n; i <= m; i++){
            sum = sum + i;
            count = count + 1;
        }
        System.out.println( sum/count);

    }
}
