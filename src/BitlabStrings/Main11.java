package BitlabStrings;
/*#11
* Программа должна принимать текст и букву, затем подсчитать сколько раз буква встречается в тексте.
Ввод
Bobby
b
Вывод
3
Ввод
Avadakedavra
a
Вывод
5*/

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0) || (s1.charAt(i) + 32) == s2.charAt(0)) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}



