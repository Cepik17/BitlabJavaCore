package BitlabStrings;
/* #20
* Сделайте некое подобие калькулятора который принимает два числа и оператор(+, -, * , /) между ними в виде текста. Выведите на экран результат операции.
Ввод
1 + 5
Вывод
6
Ввод
5 * 10
Вывод
50*/
import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < s.length() / 2; i++) { // находим первое число
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                s1 = (s1 + s.charAt(i)); // записываем одно число, потом прибавляем к нему пустоту s3, если следующее элемент тоже число
                // дописываем к певрому, таким образом запоминаем число в стринг даже если оно двузначное
            }
        }
        for (int i = 0; i < s.length(); i++) { // находим знак
            if (s.charAt(i) == 42 || s.charAt(i)== 43 || s.charAt(i)== 45 || s.charAt(i)== 47) {
                s2 = (s2 + s.charAt(i));
            }
        }
        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);
        for (int i = s.length() / 2; i < s.length(); i++) { // находим второе число
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                s3 = (s3 + s.charAt(i));
            }
        }
        System.out.println("s3=" + s3);
        num1 = Integer.parseInt(s1);
        num2 = Integer.parseInt(s3);
        if (s2.equals("*"))
            System.out.println(num1 * num2);
        else if (s2.equals("+"))
            System.out.println(num1 + num2);
        else if (s2.equals("-"))
            System.out.println(num1 - num2);
        else System.out.println(num1 / num2);
    }
}



