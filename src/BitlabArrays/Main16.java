package BitlabArrays;
/*# 24
* Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Далее, программа запрашивает пользователя число m. Если число m существует в нашем массиве, программа должна вывести слово "YES" и вывести индекс (расположение, адрес) данного числа. Иначе вывести слово "NO".

Ввод:
3
4 9 2
8
Вывод:
NO

Ввод:
10
6 19 26 3 46 8 5 65 90 25
46
Вывод:
YES
4*/
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int m = in.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (m == nums[i]) {
                k = m;
                System.out.println("YES");
                System.out.println(i);
            }
        }
        if (m != k)
                System.out.println("NO");
    }
}
