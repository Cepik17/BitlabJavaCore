package BitlabStream;
/*#4
* Программа запрашивает число n. Далее, мы вводим n чисел и сохраняем все введенные числа в список (ArrayList).
* Найти наибольший элемент в списке. Используйте Stream API. У Stream API есть готовый метод нахождения наибольшего элемента.
Ввод:
10
6 19 26 -3 46 8 5 -65 90 25
Вывод:
46*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(in.nextInt());
        }
        System.out.println(numbers.stream().max(Integer::compareTo).get()); // вместо get() можно orElse(0) - выдаст 0 если таког очисла не будет

    }
}
