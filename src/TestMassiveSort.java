public class TestMassiveSort {
    public static void main(String[] args) {
        int[] arr = new int[] {78, 34, 1, 3, -1, -4, 6};
        System.out.println("Array elements after sorting:");
//sorting logic по возрастанию
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
//prints the sorted element of the array
            System.out.println(arr[i]);
        }
    }
}


