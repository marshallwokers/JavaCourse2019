import java.util.Scanner;

public class PrintAndRead {
    private static int printAndRead(String inputPrompt) {
        System.out.print(inputPrompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int day = printAndRead("Введите день: ");
        int month = printAndRead("Введите месяц: ");
        int year = printAndRead("Введите год: ");

        System.out.print("Дата: " + day + "." + month + "." + year);
    }
}