package BitlabArrays;
/* #28
* Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Создайте второй массив из четных элементов первого массива.
Ввод:
8
4 9 2 5 8 7 11 16
Вывод:
4 2 8 16*/
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums [i]%2 == 0)
                System.out.print(nums[i] + " ");
        }

    }
}
