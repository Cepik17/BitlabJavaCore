package BitlabStream;
/*#1
* Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в список (ArrayList). Вывести все содержащиеся в данном списке четные числа. Используйте Stream API.
Ввод:
8
3 8 2 4 6 9 12 15
Вывод:
8 2 4 6 12*/
import java.util.*;
import java.util.stream.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList <Integer> numbers = new ArrayList<>();
        for (int i =0; i<size; i++){
            numbers.add(in.nextInt());
        }
       numbers.stream()
               .filter(number -> number % 2 == 0)
               .forEach(number -> System.out.print(number + " "));
    }
}
