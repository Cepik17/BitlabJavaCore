package BitlabArrays2;
/*#20
* Программа запрашивает число N, затем мы создаем двумерный массив N x N и заполняем их числами. Программа должна заменить первую нулевую строку массива на последнюю строку массива.
Ввод:
3
1 2 3
2 7 4
3 4 6
Вывод:
3 4 6
2 7 4
1 2 3*/

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[][] = new int[n][n];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        for (int j = 0; j < n; j++) { // заменяем строки через временную переменную
            int tmp[][] = new int[n][n];
            tmp[0][j] = nums[0][j];
            nums[0][j] = nums[n - 1][j];
            nums[n - 1][j] = tmp[0][j];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}

