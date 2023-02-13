package BitlabHashMap;
/*#3
* Продолжаем нашу задачу по футболистам. Теперь нужно сделать так, чтобы мы постоянно вводили футболистов с их голами, пока количество футболистов (уникальных) не станет 5. Выведите в конце имена футболистов с их голами, как на примере внизу:

Ввод:
Haaland 41
Kane 27
Mitrovic 21
Rashford 19
Kane 23
Haaland 38
Rashford 20
Odegaard 16

Вывод:
Haaland scored 38 goals in EPL
Odegaard scored 16 goals in EPL
Rashford scored 20 goals in EPL
Kane scored 23 goals in EPL
Mitrovic scored 21 goals in EPL*/
import java.util.HashMap;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        while (map.size() != 5) {
            map.put(in.next(), in.nextInt());
        }
        for (String key : map.keySet()) {
            System.out.println(key + " scored " + map.get(key) + " goals in EPL");

        }
    }
}
