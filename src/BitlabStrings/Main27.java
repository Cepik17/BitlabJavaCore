package BitlabStrings;
/* # 27
* Создайте калькулятор который принимает несколько чисел с математическими операторами (+, -, * , /) и выдает результат операции.
Ввод
5 * 5 - 4
Вывод
21
Ввод
100 - 50 + 25
Вывод
75*/
import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        String s4 = "";
        String s5 = "";
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int j = 0;
        int k = 0;
        int n = 0;
        for (int i = 0; i < s.length() / 3; i++) { // находим первое число
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                s1 = (s1 + s.charAt(i));
            }
        }
        for (int i = 0; i < s.length(); i++) { // находим знак
            if (s.charAt(i) == 42 || s.charAt(i) == 43 || s.charAt(i) == 45 || s.charAt(i) == 47) {
                s2 = (s2 + s.charAt(i));
                j = i + 1;
                break;
            }
        }
        for (int i = j; i < s.length() - 3; i++) { // находим второе число
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                s3 = (s3 + s.charAt(i));
                k = i + 1;
            }
        }
        for (int i = k; i < s.length(); i++) { // находим второй знак
            if (s.charAt(i) == 42 || s.charAt(i) == 43 || s.charAt(i) == 45 || s.charAt(i) == 47) {
                s4 = (s4 + s.charAt(i));
                n = i + 1;
            }
        }
        for (int i = n; i < s.length(); i++) { // находим третье число
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                s5 = (s5 + s.charAt(i));
            }
        }
//        System.out.println("s1=" + s1);
//        System.out.println("s2=" + s2);
//        System.out.println("s3=" + s3);
//        System.out.println("s4=" + s4);
//        System.out.println("s5=" + s5);
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s3);
        num3 = Integer.parseInt(s5);
        if (s2.equals("*")) {
            if (s4.equals("*"))
                System.out.println(num1 * num2 * num3);
            else if (s4.equals("/"))
                System.out.println(num1 * num2 / num3);
            else if (s4.equals("+"))
                System.out.println(num1 * num2 + num3);
            else System.out.println(num1 * num2 - num3);
        } else if (s2.equals("/")){
            if (s4.equals("*"))
                System.out.println(num1 / num2 * num3);
            else if (s4.equals("/"))
                System.out.println(num1 / num2 / num3);
            else if (s4.equals("+"))
                System.out.println(num1 / num2 + num3);
            else System.out.println(num1 / num2 - num3);
        }else if (s2.equals("+")){
            if (s4.equals("*"))
                System.out.println(num1 + num2 * num3);
            else if (s4.equals("/"))
                System.out.println(num1 + num2 / num3);
            else if (s4.equals("+"))
                System.out.println(num1 + num2 + num3);
            else System.out.println(num1 + num2 - num3);
        }else if (s2.equals("-")){
            if (s4.equals("*"))
                System.out.println(num1 - num2 * num3);
            else if (s4.equals("/"))
                System.out.println(num1 - num2 / num3);
            else if (s4.equals("+"))
                System.out.println(num1 - num2 + num3);
            else System.out.println(num1 - num2 - num3);
        }
    }
}