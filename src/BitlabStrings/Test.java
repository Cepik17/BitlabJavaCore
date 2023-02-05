package BitlabStrings;

public class Test {
    public static void main(String[] args) {
        String input = "Hello World Adfb";

        String temp = "";
        String result = "";

        for (int i = 0; i <= input.length(); i++) {
            if (i != input.length() && input.charAt(i) != ' ') {
                temp = temp+input.charAt(i);
            } else {
                result = temp + " " + result;
                temp = "";
            }
        }

        System.out.println("the result is: " + result);
    }
}
