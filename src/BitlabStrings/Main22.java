package BitlabStrings;
/*#22
* Программа должна приравнять все цифры в тексте к значению 0.

Ввод
Bit2015Lab

Вывод
Bit0000Lab*/

import java.util.Scanner;

public class Main22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) { // цифры - значения букв в ASCII таблице
                System.out.print(s.charAt(i));
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                System.out.print(s.charAt(i));
            } else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                System.out.print(0);
            }
        }
    }
}
