package BitlabWhileFor;
/*По данному натуральному n вычислите сумму 1^2 + 2^2 + ... + n^2.
Ввод:
2
Вывод:
5
Ввод:
5
Вывод:
55*/
import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;
        int sum=0;
        for (int i =1; i<=n; i++){
          m=  i*i;
          sum = sum + m;
        }
        System.out.println(sum);
    }

}
