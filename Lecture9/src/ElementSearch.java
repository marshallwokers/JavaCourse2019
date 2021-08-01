import java.util.Scanner;

public class ElementSearch {
    public static int searchElement(int[] array, int userNumber) {
        for (int i = 0; i < array.length; ++i) {
            if (userNumber == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Индекс числа в массиве: " + searchElement(array, userNumber));
    }
}