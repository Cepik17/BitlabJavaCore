package BitlabStrings;
/* #12
* Напишите программу которая заменяет в тексте все буквы 'a' ну букву 'о'.

Ввод
Java

Вывод
Jovo*/
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        char c [] = s1.toCharArray();
        for (int i =0; i < s1.length(); i++) {
            if (c[i] == 'a')
                c[i] = 'o';
        }
//        for (int i =0; i < s1.length(); i++){
//            if (s1.charAt(i) == 97){
//           //     s1.charAt(i) = 111;
                System.out.println(c);
            }
        }


