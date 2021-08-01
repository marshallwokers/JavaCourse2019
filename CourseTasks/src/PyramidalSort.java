import java.util.Arrays;

public class PyramidalSort {
    public static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void sifting(int[] array, int siftingStartIndex, int arraySize) {
        while (2 * siftingStartIndex + 1 < arraySize) {
            int maxElementIndex = 2 * siftingStartIndex + 1;
            int rightChildIndex = 2 * siftingStartIndex + 2;

            if (rightChildIndex < arraySize && array[rightChildIndex] > array[maxElementIndex]) {
                maxElementIndex = rightChildIndex;
            }

            if (array[siftingStartIndex] >= array[maxElementIndex]) {
                break;
            }

            exchange(array, siftingStartIndex, maxElementIndex);
            siftingStartIndex = maxElementIndex;
        }
    }

    private static void pyramidalSort(int[] array) {
        if (array.length == 0) {
            return;
        }

        int arraySize = array.length;

        for (int siftingStartIndex = arraySize / 2 - 1; siftingStartIndex >= 0; --siftingStartIndex) {
            sifting(array, siftingStartIndex, arraySize);
        }

        while (arraySize != 1) {
            exchange(array, 0, arraySize - 1);
            --arraySize;
            sifting(array, 0, arraySize);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 13, 8, 3, 11, 6, 15, 4, 12, 7, 10, 14, 5, 9};
        pyramidalSort(array);
        System.out.println(Arrays.toString(array));
    }
}