package BitlabArrays2;
/* #3
* Напишите программу в котором я ввожу два числа N и M. Затем создаю двумерный массив NxM. Далее мы заполняем этот массив числами. После заполнения программа запрашивает число K и показывает элементы только этой строки.
Ввод:
2 3
1 6 10
2 5 9
1
Вывод:
2 5 9
Ввод:
3 3
1 2 3
2 7 4
3 4 6
2
Вывод:
3 4 6*/

import java.util.Scanner;

public class Main {
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
        int k = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == k)
                    System.out.print(nums[i][j] + " ");
            }
        }
    }
}

