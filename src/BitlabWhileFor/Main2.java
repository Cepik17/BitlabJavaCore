package BitlabWhileFor;

import java.util.Scanner;

public class Main2 { //  выводит разницу максимального и минимального значения из трех введенных, разных чисел
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = a;
        int min = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        System.out.println(max - min);
    }
}
