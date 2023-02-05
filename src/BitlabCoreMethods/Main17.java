package BitlabCoreMethods;
/*#17
* Создайте такой метод, который принимает в аргументы 2 целостных чисел a и b, также знак оператора. Программа должна вывести результат исходя от арифметического оператора.
Ввод
6
8
+
Вывод
14*/
public class Main17 {
    public static void main(String[] args) {
        System.out.println(check(10,5,'+'));
    }
    public static int check(int a, int b, char c){
        int result;
        if(c == '+')
            result = a+b;
        else if(c == '-')
            result = a-b;
        else if(c == '*')
            result = a*b;
        else result = a/b;
        return result;
    }
}
