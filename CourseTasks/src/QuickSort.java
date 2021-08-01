import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        if (right < 0 || left == right) {
            return;
        }

        int pivot = array[left];
        int i = left;
        int j = right;

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (j > left) {
            quickSort(array, left, j);
        }

        if (i < right) {
            quickSort(array, i, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 2, 14, 5, 16, 22, 4};
        int left = 0;
        int right = array.length - 1;
        quickSort(array, left, right);
        System.out.println(Arrays.toString(array));
    }
}