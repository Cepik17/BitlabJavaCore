package BitlabArrays2;
/* №18
* Напишите программу в котором я ввожу два числа N и M. Затем создаю двумерный массив NxM. Далее мы заполняем этот массив числами. Программа должна вывести максимальный элемент в каждой строке.
Ввод:
2 3
0 -2 3
-5 8 -8
Вывод:
3
8*/
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int nums[][] = new int[n][m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        int max = nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            max=0; // обнулить макс
            for (int j = 0; j < nums[i].length; j++) {
                if (nums [i][j] > max) {
                    max = nums[i][j];
                }
            }
           System.out.println(max);
        }
    }
}
