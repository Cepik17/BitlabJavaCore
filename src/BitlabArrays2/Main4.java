package BitlabArrays2;
/*Программа должна напечатать индексы отрицательных чисел двумерного массива размеров NxM.
Ввод:
2 3
-5 0 3
-1 -2 4
Вывод:
0 0
1 0
1 1*/
import java.util.Scanner;

public class Main4 {
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
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] < 0)
                    System.out.println(i+ " " + j);
            }

        }
    }
}
