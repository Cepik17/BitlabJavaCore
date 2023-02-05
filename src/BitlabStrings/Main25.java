package BitlabStrings;
/* #25
* Программа должна принимать текст и показывать на экране только те слова которые находятся между символами < и >.
Ввод
Hello, this is < BITLAB > academy

Вывод
BITLAB*/

import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 60) {
                i = i + 2;
                while (s.charAt(i) != 62) {
                    System.out.print(s.charAt(i));
                    i++;
                }
            }
        }
    }
}


