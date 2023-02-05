package BitlabStrings;
/*
* Напишите программу, которая преобразует все заглавные символы строки в нижний регистр.
Ввод
Elon Musk
Вывод
eLON mUSK*/

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) { // цифры - значения букв в ASCII таблице
                s1 = String.valueOf((char) (s.charAt(i) + 32)); // из ASCII в стринг
                System.out.print(s1);
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                s2 = String.valueOf((char) (s.charAt(i) - 32));
                System.out.print(s2);
            } else if (s.charAt(i) == 32) {
                s3 = String.valueOf((char) (s.charAt(i)));
                System.out.print(s3);
            }
        }
    }
}
