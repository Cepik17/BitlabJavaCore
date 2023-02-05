package BitlabArrays;
/*Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в массив. Программа должна вывести среднее арифметическое всех четных элементов массива. (Число 0 тоже четный элемент)
Ввод:
8
3 4 2 2 6 9 1 8
Вывод:
4.4*/
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] nums = new int[size];
        int sum = 0;
        int count = 0;
        for(int i =0; i < nums.length; i++){
            nums[i]= in.nextInt();
            if (nums[i] < 0) {
                sum = sum + nums[i];
                count = count + 1;
            }
        }
        System.out.println((double) sum/count);
    }
}