package BitlabCoreMethods;
/*#5
Напишите метод, который в аргументы принимает две строки s1 и s2. Если s2 содержится внутри слова s1, то программа выводит "YES", иначе "NO".
Ввод
macbook
book
Вывод
YES
Ввод
university
ivery
Вывод
NO*/
public class Main5 {
    public static void main(String[] args) {
    }

    public static void contains(String str1, String str2) {
        if (str1.contains(str2))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
