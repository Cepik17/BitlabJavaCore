package BitlabArrays2;
/*Напишите программу которая находит и выводит максимальное значение в двумерном массиве, а также выводит его индекс.
Ввод:
2 3
6 2 7
4 11 9
Вывод:
11
1 1*/
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int i1 =0;
        int j1 =0;
        int nums[][] = new int[n][m];
        int max= nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] > max){
                    max = nums[i][j];
                    i1 = i;
                    j1 = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(i1 + " " + j1);
    }
}
