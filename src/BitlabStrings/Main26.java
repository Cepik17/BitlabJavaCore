package BitlabStrings;
/* №26
* Напишите программу которая заменяет цифры прописанные в текстовом виде на числовой формат.
Ввод
One + two = three
Вывод
1 + 2 = 3
Ввод
Eight bits is equal to one byte.
Вывод
8 bits is equal to 1 byte.*/
import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32) { //не равен пробелу
                s1 = s1 + s.charAt(i);
            }
            if (s.charAt(i) == 32 || /*s.charAt(i) == 46 ||*/ i == s.length()-1) { //равен пробелу или точке или конец строки
                if (s1.equals("one"))
                    System.out.print(1 + " ");
                else if (s1.equalsIgnoreCase("eight"))
                    System.out.print(8 + " ");
                else if (s1.equals("two"))
                    System.out.print(2 + " ");
                else if (s1.equals("three"))
                    System.out.print(3 + " ");
                else if (s1.equals("four"))
                    System.out.print(4 + " ");
                else if (s1.equals("five"))
                    System.out.print(5 + " ");
                else if (s1.equals("six"))
                    System.out.print(6 + " ");
                else if (s1.equals("seven"))
                    System.out.print(7 + " ");
                else if (s1.equals("nine"))
                    System.out.print(9 + " ");
                else if (s1.equals("zero"))
                    System.out.print(0 + " ");
                else System.out.print(s1 + " ");
               s1 = "";
            }
        }
        System.out.println(s1);
    }
}
