package BitlabArrayList;
/*#8
* Вводите числа и сохраняйте в arrayList пока не введем 0. Найдите только отрицательные числа и найдите максимальную среди них.
Ввод:
5 -9 -8 -7 9 4 7 0
Вывод:
-9 -8 -7
-7
Ввод:
8 7 4 -5 9 -8 0
Вывод:
-5 -8
-5*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        while (true) {
            nums.add(in.nextInt());
            if (nums.get(k) == 0) break;
            k++;
        }
        int max = -100;
        for (int i = 0; i < k; i++) {
            if (nums.get(i) < 0) {
                System.out.print(nums.get(i) + " ");

            }
        }
        System.out.println();
        for (int i = 0; i < k; i++) {
            if (nums.get(i) > max && nums.get(i) < 0) {
                max = nums.get(i);

            }
        }
        System.out.println(max);
    }
}



