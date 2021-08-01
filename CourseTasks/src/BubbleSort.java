import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int j = 1;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }

            ++j;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 13, 8, 3, 11, 6, 15, 4, 12, 7, 10, 14, 5, 9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}