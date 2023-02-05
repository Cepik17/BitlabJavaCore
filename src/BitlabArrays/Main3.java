package BitlabArrays;
/*Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Вывести все содержащиеся в данном массиве четные числа.

Ввод:
8
3 8 2 4 6 9 12 15
Вывод:
8 2 3 4 12*/

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            System.out.print(nums[i]*nums[i] + " ");
        }
    }
}
