import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int userNumber = scanner.nextInt();

        for (int i = 2; i <= userNumber; i++) {
            boolean isCompositeNumber = false;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isCompositeNumber = true;
                    break;
                }
            }

            if (isCompositeNumber) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}