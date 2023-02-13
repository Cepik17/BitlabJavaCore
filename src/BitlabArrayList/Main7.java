package BitlabArrayList;
/*#7
* Вводите числа и сохраняйте в arrayList пока не введем 0. Выведите не уникальные числа.
Ввод:
5 5 1 1 6 6 7 0
Вывод:
5 1 6
Ввод:
9 9 8 0
Вывод:

9*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k =0;
        ArrayList<Integer> nums = new ArrayList<>();
        while(true){
            nums.add(in.nextInt());
            if (nums.get(k)==0) break;
            k++;
        }
        for (int i = 0; i  < nums.size(); i++) {
            for (int j=i+1; j<nums.size(); j++) {
                if (nums.get(i).equals(nums.get(j))) {
                    System.out.print(nums.get(i) + " ");
                }
            }
        }

    }
}
