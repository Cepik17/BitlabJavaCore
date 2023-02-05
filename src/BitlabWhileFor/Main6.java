package BitlabWhileFor;
/*Напишите программу которая принимает целое число (int n) и показывает сумму первых n чисел из последовательности 3, 6, 9, 12, 15, 18…

Ввод:
2
Вывод:
9

Ввод:
5
Вывод:
45*/
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <=n; i++){
            sum=sum+i*3;
            //System.out.println(sum=sum+i*3);

        }
        System.out.println(sum);
    }
}
