package BitlabArrays;
/*Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце количество положительных элементов.

Ввод:
8
-4 9 2 16 -5 8 7 -11
Вывод:
5*/
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] nums = new int[size];
        int count = 0;
        for(int i =0; i < nums.length; i++){
            nums[i]= in.nextInt();
            if (nums[i] > 0)
                count = count + 1;
        }
        System.out.println(count);
    }
}
