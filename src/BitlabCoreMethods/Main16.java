package BitlabCoreMethods;
/*# 16
* Создайте такой метод, который принимает в аргументы массив целостных чисел. Выведите минимальный элемент и максимальный элемент массива.
Ввод
6
1 3 12 56 34 98
Вывод
1
98
Ввод
5
123 -9 0 987 34
Вывод
-9
987*/
public class Main16 {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 23, 5, 6, 9, 7, 5};
        check(array);
    }
    public static void check(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
        System.out.println(max);
    }
}
