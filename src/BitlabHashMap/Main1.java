package BitlabHashMap;
/*#1
* Создайте мэп куда мы добавим 5 элементов по парочкам (String, Integer) с консоли. Мы туда будет вводить имена машин с ценами. Ваша задача вывести все пары как показана на примере:
Ввод:
Mercedes 20000
Toyota 10000
Lexus 15000
Mercedes 22000
Audi 18000
Вывод:
Lexus costs 15000 USD
Toyota costs 10000 USD
Audi costs 18000 USD
Mercedes costs 22000 USD*/
import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        map.put(in.next(), in.nextInt());
        for(String key : map.keySet()) {
            System.out.println(key + " cost " + map.get(key) + " USD");
        }
    }
}
