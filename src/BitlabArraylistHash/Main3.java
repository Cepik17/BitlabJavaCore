package BitlabArraylistHash;
/*#3
* Программа запрашивает числа с консоли, пока мы не введем 0. Нужно будет сохранять все элементы в множестве. Найдите сумму всех введенных чисел.
Ввод:
1
2
3
4
5
0
Вывод:
15
Ввод:
1
1
1
2
2
3
0
Вывод:
6*/
import java.util.HashSet;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        while (true) {
               int n = in.nextInt();
                if (n != 0) {
                    set.add(n);
                }
                if (n == 0) {
                    break;
                }
            }

        int sum = 0;
        for (int i : set) {
            sum += i;
          //  System.out.print(i+ " ");
        }
        System.out.println(sum);
    }
}
