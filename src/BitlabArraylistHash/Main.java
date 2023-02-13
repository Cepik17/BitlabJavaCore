package BitlabArraylistHash;
/*#1
* Создайте множество из строк, куда мы можем добавлять строки. Добавьте 10 элементов с консоли (элементы могут повторяться). Выведите в конце размер (количество элементов) вашего множества.

Ввод:
Ilyas
Serik
Berik
Serik
Erik
Berik
Zhanat
Arman
Ilyas
Ilyas

Вывод:
6*/
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<>(10);
        for (int i =0; i<10; i++){
            set.add(in.next());
        }
        System.out.println(set.size());
    }
}
