import java.util.Scanner;

public class MultiplicationTable {
    public static int[][] getMultiplicationTable(int userNumber) {
        int[][] array = new int[userNumber][userNumber];

        for (int row = 0; row < array.length; ++row) {
            for (int column = 0; column < array[row].length; ++column) {
                array[row][column] = (row + 1) * (column + 1);
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер таблицы: ");
        int userNumber = scanner.nextInt();

        int[][] multiplicationTable = getMultiplicationTable(userNumber);

        for (int row = 0; row < multiplicationTable.length; ++row) {
            for (int column = 0; column < multiplicationTable[row].length; ++column) {
                System.out.printf("%4d ", multiplicationTable[row][column]);
            }
            System.out.println();
        }
    }
}