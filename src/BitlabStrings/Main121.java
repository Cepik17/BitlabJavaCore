package BitlabStrings;
/* #12
* Напишите программу которая заменяет в тексте все буквы 'a' ну букву 'о'.

Ввод
Java

Вывод
Jovo
* */
import java.util.Scanner;

public class Main121 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        for (int i = 0; i < str.length(); i++) {
            String str1= String.valueOf(str.charAt(i));
            if(str.charAt(i)==97){
                System.out.print("o");
            }else{
                System.out.print(str.charAt(i));
            }

        }
    }
}
