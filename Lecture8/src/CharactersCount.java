import java.util.Scanner;

public class CharactersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String userString = scanner.nextLine();

        int lettersAmount = 0;
        int digitsAmount = 0;
        int whitespacesAmount = 0;
        int restCharactersAmount = 0;

        for (int i = 0; i < userString.length(); ++i) {
            char character = userString.charAt(i);

            if (Character.isLetter(character)) {
                ++lettersAmount;
            } else if (Character.isDigit(character)) {
                ++digitsAmount;
            } else if (Character.isWhitespace(character)) {
                ++whitespacesAmount;
            } else {
                ++restCharactersAmount;
            }
        }

        System.out.println("Количество букв в строке: " + lettersAmount);
        System.out.println("Количество цифр в строке: " + digitsAmount);
        System.out.println("Количество пробелов в строке: " + whitespacesAmount);
        System.out.println("Количество остальных символов в строке: " + restCharactersAmount);
    }
}