package BitlabStrings;
/*
* Вводим в программу две строки s1 и s2. Если s2 содержится внутри слова s1, то программа выводит "Yes", иначе "No".
Ввод
universe
ivery
Вывод
No
Ввод
macbookair
book
Вывод
Yes*/
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if (s1.indexOf(s2) != -1) System.out.println("Yes"); // -1 когда такого символа нет
        else System.out.println("No");
    }
}
