package BitlabArrays;
/*Создайте массив из целых чисел и с помощью цикла выведите все элементы.

Ввод:
5
1 2 3 4 5
Вывод:
1
2
3
4
5*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int [] nums = new int[size];
        for(int i =0; i < nums.length; i++){
            nums[i]= in.nextInt();
            System.out.println(nums[i]);
        }


    }
}
