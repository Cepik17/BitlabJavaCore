package BitlabArraylistHash;
/*#3
* Программа запрашивает числа с консоли, пока мы не введем 0. Нужно будет сохранять все элементы в множестве. Выведите - "YES" если число 77 присутствует в множестве, иначе - "NO"
Ввод:
1
2
3
4
5
0
Вывод:
NO


Ввод:
1
4
2
2
3
77
23
4
0
Вывод:
YES*/
import java.util.HashSet;
import java.util.Scanner;

public class Main4 {
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
        boolean content = true;
     //   for (int i : set) {
            if (set.contains(77))
                content = false;
           // else break;
    //    }
        if (content == false)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
