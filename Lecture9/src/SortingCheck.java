public class SortingCheck {
    public static boolean isArraySortedAscending(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isArraySortedDescending(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        if (isArraySortedAscending(array1)) {
            System.out.println("Отсортирован по возрастанию");
        } else {
            System.out.println("Не отсортирован по возрастанию");
        }

        if (isArraySortedDescending(array2)) {
            System.out.println("Отсортирован по убыванию");
        } else {
            System.out.println("Не отсортирован по убыванию");
        }
    }
}