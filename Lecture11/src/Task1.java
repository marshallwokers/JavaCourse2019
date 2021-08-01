public class Task1 {
    public static int getMin(int[] array, int startIndex) {
        int minNumber = array[0];
        int indexOfMinNumber = startIndex;

        for (int i = startIndex +1; i < array.length; ++i) {
            if (array[i] < minNumber) {
                minNumber = array[i];
                indexOfMinNumber = i;
            }
        }
        return indexOfMinNumber;
    }

    public static void main(String[] args) {
        int[] array = {1, 13, 8, 3, 11, 6};
        System.out.println("Минимальное число массива: " + getMin(array));
    }
}