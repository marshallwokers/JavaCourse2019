import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваш возраст: ");
        int userAge = scanner.nextInt();

        if (userAge < 1) {
            System.out.println("Вы слишком малы.");
        } else if (userAge > 112) {
            System.out.println("Вы слишком стары.");
        } else if (userAge % 10 == 1 && userAge / 10 % 10 != 1) {
            System.out.println("Вам " + userAge + " год.");
        } else if (userAge % 10 >= 2 && userAge % 10 <= 4 && userAge / 10 % 10 != 1) {
            System.out.println("Вам " + userAge + " года.");
        } else {
            System.out.println("Вам " + userAge + " лет.");
        }
    }
}