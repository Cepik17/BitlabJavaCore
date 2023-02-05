package BitlabStrings;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        for (int i =s1.length()-1; i >= 0; i--)
            System.out.print(s1.charAt(i));
    }
}
