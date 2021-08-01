import java.util.Scanner;

public class EuclideanAlgorithm {
    public static int getGCD(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }

        while (firstNumber % secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }

        return secondNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == 0 && secondNumber == 0) {
            System.out.print("НОД искать нельзя");
        } else {
            System.out.print("Наибольший общий делитель равен: " + getGCD(firstNumber, secondNumber));
        }
    }
}