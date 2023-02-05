package BitlabStrings;
/* #19
* Программа должна принимать текст из двух символов где первый символ цифра, а вторая буква. Поменяйте местами цифру и букву, а также умножьте цифру на 2.
Ввод
3B
Вывод
B6
Ввод
5M
Вывод
M10*/

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = String.valueOf(s1.charAt(0)); // переводим ASCII в string
        int s3 = 2 * Integer.parseInt(s2);    // переводим string в  integer
        String s4 = s1.charAt(1) + String.valueOf(s3); // int s3 to String
        System.out.println(s4);
    }
}
