import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int userNumber = scanner.nextInt();

        Random random = new Random();
        int guessedNumber = 1 + random.nextInt(100);

        for (int i = 1; ; ++i) {
            if (userNumber == guessedNumber) {
                System.out.printf("Верно! Вы отгадали число за %d попыток", i);
                break;
            }

            if (userNumber < guessedNumber) {
                System.out.print("Загаданное число больше. Попробуйте ещё раз: ");
            } else {
                System.out.print("Загаданное число меньше. Попробуйте ещё раз: ");
            }

            userNumber = scanner.nextInt();
        }
    }
}