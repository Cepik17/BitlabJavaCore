package BitlabArrays2;
/* #4
* Напишите программу в котором я ввожу два числа N и M. Затем создаю двумерный массив NxM. Далее мы заполняем этот массив числами. После заполнения программа должна показать элементы строк индексы которых четные.
Ввод:
4 5
2 -4 -5 6 7
0 1 -2 9 11
-1 -1 8 3 0
3 4 5 6 7
Вывод:
2 -4 -5 6 7
-1 -1 8 3 0
Ввод:
6 3
4 8 1
0 5 6
3 8 7
1 8 3
6 7 8
5 4 3
Вывод:
4 8 1
3 8 7
6 7 8*/
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int nums[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < nums[i].length; j++) {
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
