package BitlabTryCatch;
/*#1
* Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце квадраты всех введенных чисел.
Ввод:
5
1 2 3 4 5
Вывод:
1 4 9 16 25
Ввод:
5
1 2 q 3 4
Вывод:
1 4 0 9 16*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = in.nextInt();
            }catch (Exception e){
                s = in.next();
                array[i] =0;

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]*array[i] + " ");
        }
    }
}
