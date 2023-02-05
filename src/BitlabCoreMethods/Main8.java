package BitlabCoreMethods;
/*#8
Создайте такой метод, который принимает в аргументы двумерный массив размера NxN. Программа должна заменить первую нулевую строку массива на последнюю строку массива.*/

public class Main8 {
    public static void main(String[] args) {
        int array[][] = {{9, 4, 7}, {78, 90, 45}, {71, 4, 55}};
        check(array);
    }

    public static void check(int array[][]) {
        for (int j = 0; j < array.length; j++) { // заменяем строки через временную переменную
            int[][] tmp = new int[array.length][array.length];
            tmp[0][j] = array[0][j];
            array[0][j] = array[array.length - 1][j];
            array[array.length - 1][j] = tmp[0][j];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
