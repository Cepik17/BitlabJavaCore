package BitlabStrings;
/* #8
Напишите программу которая принимает число(В интервале от 0 до 9) в текством формате и показывает на экране в виде цифры.
Ввод
one
Вывод
1
Ввод
seven
Вывод
7*/
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        if (s1.equals("one"))
            System.out.println(1);
        if (s1.equals("two"))
            System.out.println(2);
        if (s1.equals("three"))
            System.out.println(3);
        if (s1.equals("four"))
            System.out.println(4);
        if (s1.equals("five"))
            System.out.println(5);
        if (s1.equals("six"))
            System.out.println(6);
        if (s1.equals("seven"))
            System.out.println(7);
        if (s1.equals("eight"))
            System.out.println(8);
        if (s1.equals("nine"))
            System.out.println(9);
        if (s1.equals("zero"))
            System.out.println(0);

    }
}
