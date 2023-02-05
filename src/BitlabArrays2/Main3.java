package BitlabArrays2;
/*#5
* Программа запрашивает два числа N и М, затем создает двумерный массив размером NxM. Пользователь заполняет массив значениями, после чего программа должна показать только четные элементы массива.
Ввод:
2 3
4 5 6 7 8 9
Вывод:
4 6
8
Ввод:
4 5
7 3 4 9 10
16 7 8 2 0
9 1 4 12 3
-2 6 7 1 2
Вывод:
4 10
16 8 2 0
4 12
-2 6 2*/
import java.util.Scanner;

public class Main3 {
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
                if(nums[i][j]%2 == 0)
                    System.out.print(nums[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
