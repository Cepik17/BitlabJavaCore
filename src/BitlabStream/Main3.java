package BitlabStream;
/*#3
* Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в список (ArrayList). Найти сумму всех элементов списка. Используйте Stream API.
Ввод:
10
6 19 26 -3 46 8 5 -65 90 25
Вывод:
157*/
import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList <Integer> numbers = new ArrayList<>();
        for (int i =0; i<size; i++) {
            numbers.add(in.nextInt());
        }
        System.out.println(numbers.stream().mapToInt(i -> i).sum());
        //map - преобразует в другой вид, maptoInt в Int, а у Integer есть метод sum.

    }
}
