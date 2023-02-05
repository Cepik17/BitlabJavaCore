package BitlabArrays;
/* #21
Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести максимальное и минимальное значение в массиве.
Ввод:
4
4 9 2 5
Вывод:
2 9*/
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int min = nums[0]; // find min
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int max = nums[0]; // find max
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.print(min + " " + max);
    }
}

