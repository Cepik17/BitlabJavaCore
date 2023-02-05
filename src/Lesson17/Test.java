package Lesson17;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
        int[] array = {1, 3, 3, 56, 1, 98};
               // int n = sc.nextInt();
             //   int a[] = new int[n];
           //     for (int i = 0; i < array.length; i++);
                for (int i = 0; i < array.length; i++) {
                    int flag = 0;
                    for (int j = 0; j < array.length; j++) {
                        if (array[i] == array[j]) flag++;
                    }
                    if (flag < 2) System.out.println(array[i]);
                }
            }
        }

