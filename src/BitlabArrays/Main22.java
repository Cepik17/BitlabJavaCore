package BitlabArrays;
/* # 30.Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна проверить чередуются ли в нем положительные и отрицательные числа. Если чередуются, то вывести YES, иначе NO.
Ввод:
6
8 -2 4 6 9 12
Вывод:
NO
Ввод:
6
4 -2 7 -5 13 -16
Вывод:
YES
* */
import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] nums = new int[size];
        int k = 0;
        boolean m = true;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] * nums[i + 1] < 0) { // если произведение i и  i+1 отрицательное то положительные и отрицательные числа чередуются
                m = false; // нужно чтобы вывестиы println вне цикла
                k = i + 1;
            } else m = true;
        }
       /*  for (int i = k; i < nums.length - 1; i++) {
            if (nums[i] * nums[i + 1] < 0) {
                m = false;
            }
             System.out.println("nums2 " +  nums[i]);
        }*/
        if (m == true)
            System.out.println("NO");
        else System.out.println("YES");

    }
}





