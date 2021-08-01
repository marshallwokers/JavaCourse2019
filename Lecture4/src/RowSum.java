import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int userNumber = scanner.nextInt();

        int i = 1;
        int result = 0;

        while (i <= userNumber) {
            int nextNumber;
            if (i % 2 == 0) {
                nextNumber = -i * i;
            } else {
                nextNumber = i * i;
            }
            result += nextNumber;
            ++i;
        }
        System.out.print("Сумма ряда равна " + result);
    }
}