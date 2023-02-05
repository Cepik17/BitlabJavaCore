package BitlabStrings;
/*
* Сделайте счетчик который считает количество букв в тексте исключая цифры и символы.
Ввод
_sniper90 _
Вывод
6
Ввод
String [] words = new String[30];
Вывод
20*/
import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122))
                count = count +1;
        }
        System.out.println(count);
    }
}
