import java.util.Scanner;

public class TenNumbersInLineDifficult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите последнее число: ");
        int lastNumber = scanner.nextInt();

        System.out.print("Введите количество чисел в строке: ");
        int numbersInLine = scanner.nextInt();

        int i = firstNumber;
        int count = 0;
        while (i <= lastNumber) {
            ++count;
            if (count % numbersInLine != 0) {
                System.out.printf("%4d ", i);
            } else {
                System.out.printf("%4d%n", i);
            }
            ++i;
        }
    }
}
