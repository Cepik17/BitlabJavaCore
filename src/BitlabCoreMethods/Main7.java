package BitlabCoreMethods;
/*#7
* Создайте такой метод, который принимает в аргументы массив целостных чисел. Программа должна вывести среднее арифметическое всех четных элементов массива.
Ввод
6
1 3 12 56 34 98
Вывод
50*/

public class Main7 {
    public static void main(String[] args) {
        int[] array = {1, 3, 12, 56, 34, 98};
        System.out.println(check(array));
    }

    public static int check(int[] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
                count = count + 1;
            }
        return sum / count;
    }
}
