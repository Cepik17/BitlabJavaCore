package BitlabStrings;
/* #28
Напишите программу которая прописывает каждое слово в тексте в обратном порядке.
Ввод
Bitlab Academy
Вывод
baltiB ymedacA
Ввод
Java programming language
Вывод
avaJ gnimmargorp egaugnal
* */
import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32) {
                s1 = s1 + s.charAt(i);
            }
            if (s.charAt(i) == 32 || i == s.length() - 1) {
                s2 = s2 + s.charAt(i);
                for (int j = s1.length() - 1; j >= 0; j--) {
                    System.out.print(s1.charAt(j));
                }
                System.out.print(" ");
                s1 = "";
                s2 = "";
            }
        }
    }
}
