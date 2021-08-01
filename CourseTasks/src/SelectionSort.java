import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minNumberIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minNumberIndex]) {
                    minNumberIndex = j;
                }
            }

            int temp = array[minNumberIndex];
            array[minNumberIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 13, 8, 3, 11, 6, 15, 4, 12, 7, 10, 14, 5, 9};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}