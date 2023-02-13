package BitlabHashMap;
/*#2
* Наша задача хранить лучших бомбардиров чемпионата Англии. Для этого мы добавляем 5 футболистов с количеством голов в определенный мэп. Выведите количество футболистов (уникальных).
Ввод:
Haaland 41
Kane 27
Mitrovic 21
Rashford 19
Kane 23
Вывод:
4*/
import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        System.out.println(map.size());
    }
}
