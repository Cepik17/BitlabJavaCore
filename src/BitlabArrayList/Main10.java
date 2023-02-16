package BitlabArrayList;
/*10
* Программа запрашивает число n. Мы вводим n чисел и сохраняем все введенные числа в arrayList. Далее, программа запрашивает число m. Мы вводим m чисел и сохраняем все введенные числа в arrayList2. Учитывая что оба массива чисел отсортированы, объедините arrayList в arrayList2 как один отсортированный arrayList.
Ввод:
5
4 9 8 7 5
6
5 6 3 2 1 4
Вывод:
Sorted first array:
4 5 7 8 9
Sorted second array:
1 2 3 4 5 6
Sorted third array:
1 2 3 4 4 5 5 6 7 8 9*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();
        ArrayList<Integer> nums3 = new ArrayList<>();
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            nums.add(in.nextInt());
        }
        int size2 = in.nextInt();
        for (int i = 0; i < size2; i++) {
            nums2.add(in.nextInt());
        }
        System.out.println("Sorted first array:");
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
        System.out.println();
        System.out.println("Sorted second array:");
        for (int i = 0; i < size2; i++) {
            for (int j = i + 1; j < size2; j++) {
                if (nums2.get(i) > nums2.get(j)) {
                    Integer tmp;
                    tmp = nums2.get(i);
                    nums2.set(i, nums2.get(j));
                    nums2.set(j, tmp);
                }
            }
            System.out.print(nums2.get(i) + " ");
        }
        System.out.println();
        //добавляем второй лист в первый
        int size3 = size + size2;
        for (int i = 0; i < size2; i++) {
            nums.add(nums2.get(i));
        }
        System.out.println("Sorted third array:");
        for (int i = 0; i < size3; i++) {
            for (int j = i + 1; j < size3; j++) {
                if (nums.get(i) > nums.get(j)) {
                    Integer tmp;
                    tmp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, tmp);
                }
            }
            System.out.print(nums.get(i) + " ");
        }


    }
}
