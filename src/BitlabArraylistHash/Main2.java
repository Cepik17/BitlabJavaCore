package BitlabArraylistHash;
/*№2
*Ваша задача создать множество из чисел, куда мы вводим 5 элементов. После, нужно вывести сумму всех элементов в множестве.
* Ввод:
1
1
1
2
2

Вывод:
3 */
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>(5);
        for (int i =0; i<5; i++){
            set.add(in.nextInt());
        }
        int sum=0;
        for (int i : set) { // i - переменная того же типа что и массив, принимает по очеради значения массива
            sum+=i;
           // System.out.println(i);
        }
        System.out.println(sum);
    }
}
