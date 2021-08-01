import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];

            for (int j = i - 1; ; --j) {
                if (j < 0 || temp >= array[j]) {
                    array[j + 1] = temp;
                    break;
                }

                array[j + 1] = array[j];
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 13, 8, 3, 11, 6, 15, 4, 12, 7, 10, 14, 5, 9};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}