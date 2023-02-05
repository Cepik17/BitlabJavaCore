package BitlabArrays;
/* #15
Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести умножение элементов не равных нулю.
Ввод:
6
0 2 4 0 3 1
Вывод:
24*/
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        int mult = 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (nums[i] != 0) {
                mult = mult * nums[i];
            }
        }
        System.out.print(mult);
    }

}