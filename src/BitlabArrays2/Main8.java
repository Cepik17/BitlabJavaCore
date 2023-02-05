package BitlabArrays2;
/* #16
Напишите программу которая выводит двумерный массив в зеркальном отражении относительно вертикали.
Ввод:
2 3
6 2 7
4 11 9
Вывод:
7 2 6
9 11 4*/
import java.util.Scanner;

public class Main8 {
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
            for (int j = nums[i].length-1; j >=0; j--) {
                System.out.print(nums[i][j] +  " ");
            }
            System.out.println();
        }
    }
}
