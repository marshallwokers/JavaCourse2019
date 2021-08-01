import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int userNumber = scanner.nextInt();

        int sum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (userNumber != 0) {
            int lastDigit = userNumber % 10;
            sum += lastDigit;

            if (lastDigit % 2 != 0) {
                oddDigitsSum += lastDigit;
            }

            maxDigit = Math.max(maxDigit, lastDigit);
            userNumber /= 10;
        }

        System.out.println("Сумма всех цифр числа равна " + sum);
        System.out.println("Сумма нечетных цифр числа равна " + oddDigitsSum);
        System.out.println("Максимальная цифра числа " + maxDigit);
    }
}