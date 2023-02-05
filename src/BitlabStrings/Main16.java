package BitlabStrings;
/*
* Напишите программу которая выводит сумму всех цифр в тексте.
Ввод
2Java5Course

Вывод
7

Ввод
BMW530i

Вывод
8*/
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2;
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= 48 && s1.charAt(i) <= 57) {
                s2 = String.valueOf(s1.charAt(i)); // переводим ASCII в char
                sum = sum + Integer.parseInt(s2); // переводим char в  integer
            }
        }
        System.out.println(sum);


    }
}
