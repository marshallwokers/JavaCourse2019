import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду: ");
        String command = scanner.nextLine();

        switch (command) {
            case "print":
                System.out.println("Введите строку: ");
                String line = scanner.nextLine();
                System.out.println(line);
                break;
            case "sum":
                System.out.println("Введите первое вещественное число: ");
                double number1 = scanner.nextDouble();
                System.out.println("Введите второе вещественное число: ");
                double number2 = scanner.nextDouble();
                System.out.println("Сумма чисел равна " + (number1 + number2));
                break;
            default:
                System.out.println("Неизвестная команда");
        }
    }
}