package BitlabStrings;
/*#10
Напишите программу, которая продублирует все символы введенного текста.
Ввод
Bitlab
Вывод
BBiittllaabb
* */
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            System.out.print((s1.charAt(i) + "" + s1.charAt(i))); // "" использовать чтобы не переводил символы char в цифры ASCII
        }
    }
}
