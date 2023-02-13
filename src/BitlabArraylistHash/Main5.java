package BitlabArraylistHash;
/*#5
* Программа запрашивает строки из консоли, которые мы сохраняем в множество. Программа должна перестать запрашивать строку если вы введете текст - "stop".
Выведите сумму длины каждой строки.

Ввод:
Ilyas
Erzhan
Arman
Erzhan
stop

Вывод:
16*/
import java.util.HashSet;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String s;
        int count = 0;
        while (true) {
            s = in.next();
            if (s.equals("stop")) {
                break;
            } else set.add(s);

        }
        for (String string : set) {
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) != 32) { //не равен пробелу
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
