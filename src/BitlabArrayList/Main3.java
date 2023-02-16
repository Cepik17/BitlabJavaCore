package BitlabArrayList;
/*#3
Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в arrayList. Найдите и выведите второе максимальное число.
Ввод:
10
1 2 3 4 5 6 7 8 9 10
Вывод:
9
Ввод:
5
18 20 22 16 14
Вывод:
20*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(in.nextInt());
        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums.get(i) > nums.get(j)) {
                    Integer tmp;
                    tmp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, tmp);
                }
            }
            System.out.print(nums.get(i) + " ");
        }
        System.out.println(nums.get(size - 2));
    }
}

