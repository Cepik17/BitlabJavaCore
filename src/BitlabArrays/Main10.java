package BitlabArrays;
/* # 17
Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести умножение элементов не равных 0 и c четным индексом.
Ввод:
4
9 2 4 0
Вывод:
36
 */
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        int mult = 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
            if (i % 2 == 0 && nums[i] != 0) {
                mult = mult * nums[i];
            }

        }

        System.out.println(mult);
    }
}
