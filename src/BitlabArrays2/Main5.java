package BitlabArrays2;
/* #11
Выведите сумму элементов каждой строки двумерного массива размером NxM. Размер и значения задаются с консоли.
Ввод:
2 3
6 2 7
4 11 9
Вывод:
15
24*/
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum;
        int nums[][] = new int[n][m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < nums.length; i++) {
            sum=0;
            for (int j = 0; j < nums[i].length; j++) {
                sum = sum + nums[i][j];
            }
            System.out.println(sum);
        }
    }
}
