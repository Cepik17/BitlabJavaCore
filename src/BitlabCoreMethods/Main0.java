package BitlabCoreMethods;

public class Main0 {
    public static void main(String[] args) {
        System.out.println(getSum(3, 7));
        System.out.println(getHello("Arman"));
        System.out.println(getSum(2, 10));
        System.out.println(getHello("Jose"));
    }

    public static int getSum(int n, int m) {
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum = sum + i;

        }
        return sum;
    }

    public static String getHello(String s) {
        return "hello" + s;
    }
}
