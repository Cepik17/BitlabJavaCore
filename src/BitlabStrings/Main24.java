package BitlabStrings;
/* #24
* Напишите программу которая переписывает текст так чтобы каждое слово начиналось с заглавной буквы.
Ввод
zinedine zidane
Вывод
Zinedine Zidane*/
import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(String.valueOf((char)(s.charAt(0) - 32)));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 32) { // находим пробел и следующую букву делаем прописной
                System.out.print(s.charAt(i));
                i++;
                System.out.print(String.valueOf((char)(s.charAt(i) - 32)));
            }
            else System.out.print(s.charAt(i));
        }
    }
}
