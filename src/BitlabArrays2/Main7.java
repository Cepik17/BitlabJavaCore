package BitlabArrays2;
/* #14
* Ваша программа должна находить в двумерном массиве минимальный и максимальный элементы, затем поменять их местами в массиве.
Ввод:
2 3
6 2 7
4 11 9
Вывод:
6 11 7
4 2 9*/
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int imax = 0;
        int jmax = 0;
        int imin = 0;
        int jmin = 0;
        int nums[][] = new int[n][m];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        int max = nums[0][0];
        int min = nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] > max) {
                    max = nums[i][j];
                    imax = i;
                    jmax = j;
                }
                if (nums[i][j] < min) {
                    min = nums[i][j];
                    imin = i;
                    jmin = j;
                }
            }
        }
        int a = nums[imin][jmin];
        nums[imin][jmin] = nums[imax][jmax];
        nums[imax][jmax]= a;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] +  " ");
            }
            System.out.println();
        }
    }
}