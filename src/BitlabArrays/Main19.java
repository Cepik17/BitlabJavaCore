package BitlabArrays;
/* #27
Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна заменить местами максимальный и минимальный элементы.
Ввод:
3
4 9 2
Вывод:
4 2 9

Ввод:
10
1 2 3 4 5 6 7 8 9 10
Вывод:
10 2 3 4 5 6 7 8 9 1
 * */

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int minind = 0;
        int maxind = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <  nums[minind]) {
                minind = i;
            }
            if (nums[i] > nums[maxind]) {
                maxind = i;
            }
        }
        System.out.println(nums [minind]);
        System.out.println(nums [maxind]);
        int m = nums[minind];
        nums[minind] = nums[maxind];
        nums[maxind] = m;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
