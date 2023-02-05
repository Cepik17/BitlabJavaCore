package BitlabCoreMethods;
/*#6
* Создайте такой метод, который принимает в аргументы логин и пароль. И если данные были введены верно, то мы выводим Authentication completed, иначе Invalid login or password. (Логин должен быть - admin, пароль - qwerty)
Ввод
admin
qwerty
Вывод
Authentication completed
Ввод
user
123456
Вывод
Invalid login or password*/
public class Main6 {
    public static void main(String[] args) {
        System.out.println(check("admin", "password"));
    }

    public static String check(String str1, String str2) {
        if (str1.equals("admin") && str2.equals("qwerty"))
            return "Authentication completed";
        else return "Invalid login or password";
    }
}

