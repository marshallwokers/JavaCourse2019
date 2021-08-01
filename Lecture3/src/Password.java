import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "bazinga";

        System.out.print("Введите пароль: ");
        String userPassword = scanner.nextLine();

        if (correctPassword.equals(userPassword)) {
            System.out.println("Пароль верный");
        } else if (userPassword.length() > correctPassword.length()) {
            System.out.println("Строка слишком длинная");
        } else if (userPassword.length() < correctPassword.length()) {
            System.out.println("Строка слишком короткая");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}