package BitlabArrays;
/* # 18
* Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце максимальный элемент массива.

Ввод:
4
4 9 2 5
Вывод:
9*/
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        int max = nums [0];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums [i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
