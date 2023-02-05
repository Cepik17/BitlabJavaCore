package BitlabArrays2;
/* # 19
* Напишите программу в котором я ввожу два числа N и M. Затем создаю двумерный массив NxM. Далее мы заполняем этот массив числами. Программа должна вывести максимальный элемент в каждом столбце.
Ввод:
2 3
0 -2 3
-5 8 -8
Вывод:
0
8
3*/
import java.util.Scanner;

public class Main10 {
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
        for (int j = 0; j < m; j++) {
            max = 0; // обнулить макс
            for (int i = 0; i < n; i++) {
                if (nums[i][j] > max)
                    max = nums[i][j];
            }
            System.out.println(max);
        }
    }
}
