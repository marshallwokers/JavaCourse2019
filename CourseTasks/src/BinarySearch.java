import java.util.Scanner;

public class BinarySearch {
    public static int binarySearchWithRecursion(int[] array, int left, int right, int number) {
        if (left > right) {
            return -1;
        }

        int middle = (right + left) / 2;

        if (number == array[middle]) {
            return middle;
        }

        if (number > array[middle]) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }

        return binarySearchWithRecursion(array, left, right, number);
    }

    public static int binarySearchWithoutRecursion(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;

        for (; ; ) {
            if (left > right) {
                return -1;
            }

            int middle = (right + left) / 2;

            if (number == array[middle]) {
                return middle;
            }

            if (number > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для поиска: ");
        int number = scanner.nextInt();

        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int left = 0;
        int right = array.length - 1;

        System.out.println("Индекс числа (поиск с рекурсией): " + binarySearchWithRecursion(array, left, right, number));
        System.out.println("Индекс числа (поиск без рекурсии): " + binarySearchWithoutRecursion(array, number));
    }
}