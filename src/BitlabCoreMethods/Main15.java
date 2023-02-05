package BitlabCoreMethods;
/* # 15
* Создайте такой метод, который принимает в аргументы массив целостных чисел. Метод должен вывести на экран уникальные элементы массива.
Ввод
5
1 2 3 4 5
Вывод
1 2 3 4 5
Ввод
8
1 0 4 5 0 7 5 7
Вывод
1 4*/
public class Main15 {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 2, 5, 0, 3};
        check(array);
    }

    public static void check(int[] array) {
        //проверяем если элементы повторяются
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j])
                    count++;
            }
            if (count < 2)
                System.out.print(array[i] + " ");
        }
    }
}

