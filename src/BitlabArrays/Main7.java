package BitlabArrays;
/* #14
Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце элементы массива, которые больше среднего арифметического.
Ввод:
8
4 9 2 5 8 7 11 16
Вывод:
9 8 11 16*/

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            sum = sum + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > sum / nums.length) {
                System.out.print(nums[i] + " ");
            }
        }

    }
}

