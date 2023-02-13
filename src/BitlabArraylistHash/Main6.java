package BitlabArraylistHash;
/*#6
* Программа запрашивает строки из консоли, которые мы сохраняем в множество. Программа должна перестать запрашивать строку если вы введете текст - "stop".
В конце, выведите все гласные буквы (a, e, i, o, u) в тексте. Примечание, если вы ввели текст с большой буквы, то перед добавлением его в множество, уменьшите его (измените на нижний регистр). Например, если вы ввели "ILYAS", то сохраните его как "ilyas".

Ввод:
Ilyas
Erzhan
Arman
ILYAS
erzhan
stop

Вывод:
5*/
import java.util.HashSet;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String s;
        String s2 = "aeiou";
        int count = 0;
        while (true) {
            s = in.next().toLowerCase();
            if (s.equals("stop")) {
                break;
            } else set.add(s);

        }
        for (String string : set) {
            for (int i = 0; i < string.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (string.charAt(i) == s2.charAt(j))
                        count++;
                }
            }

        }
        System.out.println(count);

    }
}

//Другой вариант

/*
* public class Main {
    public static void main(String... args) {
        Scanner x = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        String s = x.nextLine().toLowerCase();
        set.add(s);
        int ans = 0;
        if (!s.equals("stop")){
            ans = check(s);
        }
        while (!s.equals("stop")){
            s = x.nextLine().toLowerCase();
            if (s.equals("stop")){
                break;
            }
            if (set.add(s)){
                ans += check(s);
            }
        }
        System.out.println(ans);

    }
    public static int check(String s){
        String glas = "aeiou";
        int cnt = 0;
        for(Character ch : s.toCharArray()){
            if (glas.indexOf(ch) > -1){
                cnt++;
            }
        }
        return cnt;
    }
}*/