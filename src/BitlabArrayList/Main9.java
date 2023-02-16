package BitlabArrayList;
/*#9
* Вводите числа и сохраняйте в arrayList пока не введем 0. Выведите только простые числа. Простые числа - числа которые делятся только на себя и на 1.
Ввод:
1 2 3 4 5 0
Вывод:
2 3 5
Ввод:
1 2 3 4 5 6 7 8 9 10 0
Вывод:
2 3 5 7*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        while (true) {
            nums.add(in.nextInt());
            if (nums.get(k) == 0) break;
            k++;
        }
        for (int i = 0; i < nums.size(); i++) {
            int delitel = 1;
            int count = 0;
            while (nums.get(i) >= delitel) {
                if (nums.get(i) % delitel == 0)
                    count++;
                delitel++;
            }
            if (count == 2)
                System.out.print(nums.get(i) + " ");
        }
    }
}
