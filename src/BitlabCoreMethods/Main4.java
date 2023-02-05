package BitlabCoreMethods;
/*#4
* Напишите метод, который в аргументы принимает строку. Нужно определить, является ли наша строка палиндромом или нет. Палиндром - это когда текст читается так же одинаково если ее читать в обратном порядке.
Ввод
kazak
Вывод
YES
Ввод
bitlab
Вывод
NO*/
public class Main4 {
    public static void main(String[] args) {
        System.out.println(palindrome("bitlab"));
    }
    public static String palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return "NO";
        }
        return "YES";
    }
}
