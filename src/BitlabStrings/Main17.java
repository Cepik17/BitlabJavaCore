package BitlabStrings;
/* # 17
* Вводим строки s1 и s2 в программу. Программа должна вывести "Yes", если s2 является противоположным (в обратном чтении) s1. Иначе "No".

Ввод
universe
ivery
Вывод
No
Ввод
macbookair
riakoobcam

Вывод
Yes*/

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        boolean c = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) { // проверяем первый символ s1 и последний символ s2
                break;
            }
            c = false;
        }
        if (c == false)
            System.out.println("Yes");
        else System.out.println("No");
    }
}

