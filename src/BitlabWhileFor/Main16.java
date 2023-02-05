package BitlabWhileFor;
/*Солдат хочет купить w бананов в магазине. Ему надо заплатить k долларов за первый банан, 2k долларов - за второй и так далее (иными словами, за i-й банан надо заплатить i·k долларов). У него есть n долларов. Сколько долларов ему придется одолжить у однополчанина, чтобы купить w бананов?
В первой строке записано три положительных целых числа k,n,w (1≤k,w≤1000, 0≤n≤109), стоимость первого банана, изначальное количество долларов у солдата и количество бананов, которые он хочет купить.
Выведите единственное целое число - количество долларов, которое солдату надо одолжить у однополчанина. Если деньги одалживать не надо, выведите 0.
Ввод:
3 17 4
Вывод:
13*/
import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt(); // цена банана
        int n = in.nextInt(); // всего n долларов
        int w = in.nextInt(); // кол-во бананов
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum = sum + i * k;
        }
        if (sum > n)
            System.out.println(sum - n);
        else
            System.out.println(0);
    }
}