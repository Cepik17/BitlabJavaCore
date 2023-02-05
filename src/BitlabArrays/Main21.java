package BitlabArrays;
/* #29
* Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести сумму всех чисел которые находятся между нулями.
Ввод:
4
0 -2 4 0
Вывод:
2

Ввод:
10
6 19 0 -3 4 8 0 -6 9 5
Вывод:
9*/
import java.util.Scanner;

public class Main21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int zero1 = 0;
        int zero2 = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero1 = i;
                break;
            }
        }
        for (int i = zero1 + 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero2 = i;
                break;
            }
        }
        for (int i = zero1 + 1; i < zero2; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }
}

