package BitlabCoreMethods;
/* #9
Создайте такой метод, который принимает в аргументы массив из целых чисел. Программа должна выводить нечетные числа из массива и остановится, если встретит число 23.
* */
public class Main9 {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 23, 5, 6, 9, 7, 5};
        check(array);
    }

    public static void check(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                if (array[i] != 23) {
                    System.out.println(array[i]);
                } else break;
            }
        }
    }
}
