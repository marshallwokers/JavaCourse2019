import java.util.Arrays;

public class ReverseArray {
    public static void revertArray(int[] array) {
        for (int i = 0; i < array.length / 2; ++i) {
            int storage = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = storage;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        revertArray(array);
        System.out.println(Arrays.toString(array));
    }
}