package BitlabArrays;
/*Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Выведите в конце только положительные элементы.
Ввод:
10
6 19 26 -3 46 8 5 -65 90 25
Вывод:
6 19 26 46 8 5 90 25*/
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] nums = new int[size];
        for(int i =0; i < nums.length; i++){
            nums[i]= in.nextInt();
            if (nums[i] > 0)
                System.out.print(nums[i] + " ");
        }
    }
}
