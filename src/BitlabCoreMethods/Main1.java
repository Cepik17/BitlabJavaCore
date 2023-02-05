package BitlabCoreMethods;
/*#1 Напишите метод, который в аргументы принимает 3 значения целостных чисел, и возвращает самую максимальную из них.
Ввод:
3
6
9
Вывод:
9
Ввод:
-4
29
17
Вывод:
29*/

public class Main1 {
    public static void main(String[] args) {
        System.out.println(getMax(3, 6, 9));
    }

    public static int getMax(int a, int b, int c) {
        int max =0;          // int max =a;
        if (a > b && a > c)  // if (b > max) max =b;
            max = a;         // if (c > max) max =c;
        else if (b > a && b > c)
            max =b;
        else max = c;
        return max;
    }
}
