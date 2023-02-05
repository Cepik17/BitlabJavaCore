package BitlabArrays;
/*Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести сумму и среднее значение введенных чисел.

Ввод:
3
4 9 2
Вывод:
15 5.0*/
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] nums = new int[size];
        int sum = 0;

        for(int i =0; i < nums.length; i++){
            nums[i]= in.nextInt();
            sum= sum + nums[i];
        }
        double ave = (double)sum/nums.length;
        System.out.println(sum + " " + ave);
    }
}
