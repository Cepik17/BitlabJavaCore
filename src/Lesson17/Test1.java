package Lesson17;

public class Test1 {


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(50); // capacity 50 symbols. default capacity 16 symbols
        StringBuilder sb2 = new StringBuilder("Good day!!!");
        System.out.println(sb2.length());
        System.out.println(sb2.charAt(2)); // character at index 2
    }
}
