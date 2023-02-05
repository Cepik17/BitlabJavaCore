package BitlabCoreMethods;
/* # 2
* Напишите метод, который в аргументы принимает три натуральных числа a, b, c. Определите, существует ли треугольник с такими сторонами.
Если треугольник существует, выведите строку YES, иначе выведите строку NO.
Ввод:
4
6
9
Вывод:
YES
Ввод:
3
6
2
Вывод:
NO*/

public class Main2 {
    public static void main(String[] args) {
        System.out.println(triangle(1, 1, 9));
    }

    public static String triangle(int a, int b, int c) {
        String t;
        if (c >= (a + b) || a >= (b + c) || b >= (a + c))
            t = "NO";
        else t = "YES";
        return t;
    }
}
