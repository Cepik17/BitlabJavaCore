package BitlabCoreMethods;

/* # 3Напишите метод, который в аргументы принимает строку и букву. Нужно посчитать сколько раз буква встречается в тексте. (Без учета регистра)
        Ввод:
        Bitlab
        b
        Вывод:
        2
        Ввод:
        Java
        a
        Вывод:
        2

 */
public class Main3 {
    public static void main(String[] args) {
        System.out.println(check("HeLlo", 'l'));
    }

    public static int check(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter || str.charAt(i) == (letter - 32)) {
                count = count + 1;
            }
        }
        return count;

    }
}
