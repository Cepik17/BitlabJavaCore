package BitlabArrays;
/* # 25
Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Затем мы вводим число m. Программа должна вывести среднее значение всех элементов, которые больше m.
Ввод:
4
0 -2 4 0
1
Вывод:
4.0

Ввод:
10
6 19 0 -3 4 8 0 -6 9 5
5
Вывод:
10.5*/

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (m < nums[i]) {
                count = count + 1;
                sum = sum+ nums[i];
            }
        }System.out.println((double)sum/count);
    }
}
