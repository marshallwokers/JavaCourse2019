import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        String hiddenString = "Загаданная строка";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку: ");
            String userString = scanner.nextLine();

            if (hiddenString.equals(userString)) {
                System.out.print("Строка верна");
                break;
            }

            System.out.println("Попробуйте ещё раз");
        }
    }
}