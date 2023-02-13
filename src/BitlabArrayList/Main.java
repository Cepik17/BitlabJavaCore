package BitlabArrayList;
/*#1
Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в arrayList. Выведите результат деление всех введенных чисел на 2.
Ввод:
5
2 4 6 8 10
Вывод:
1 2 3 4 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList <Integer> nums = new ArrayList<>();
        for (int i =0; i<size; i++){
                nums.add(in.nextInt());
        }
        for (int i =0; i<size; i++){
            System.out.print(nums.get(i)/2 + " ");
        }
    }
}
