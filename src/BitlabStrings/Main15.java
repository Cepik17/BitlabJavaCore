package BitlabStrings;
/*
* Мы вводим строку (текст) в нашу программу. Программа должна вывести количество гласных букв. (Гласные буквы: a, e, i, o, u)
Ввод
Tesla
Вывод
2*/
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = "aeiouyAEIOUY";
        //char[] c = {'a', 'e', 'i', 'o', 'u' };
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j =0 ; j < s2.length(); j++){
             if (s1.charAt(i) == s2.charAt(j))
                count = count + 1;
           }
        }
        System.out.println(count);
    }


}

