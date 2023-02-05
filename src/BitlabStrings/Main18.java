package BitlabStrings;
/* #18
* Мы вводим строку (текст) в нашу программу. Программа должна определить, является ли наш текст "Палиндром"-ом или нет. Палиндром - это когда текст читается так же одинаково если ее читать в обратном порядке.
Ввод
kazak
Вывод
Yes
Ввод
Assets

Вывод
No*/
import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        boolean c = true;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
                break;
            }
                c = false;
        }
        if (c == false)
            System.out.println("Yes");
        else System.out.println("No");
    }
}
