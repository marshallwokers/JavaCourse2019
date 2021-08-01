import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();

        int f0 = 0;

        if (userNumber == 0) {
            System.out.println("Число Фибоначчи с номером 0 равно " + f0);
        } else {
            int f1 = 1;
            int fibonacciNumber = f0 + f1;

            for (int i = 2; i < userNumber; i++) {
                f0 = f1;
                f1 = fibonacciNumber;
                fibonacciNumber = f0 + f1;
            }

            System.out.println("Число Фибоначчи с номером " + userNumber + " равно " + fibonacciNumber);
        }
    }
}