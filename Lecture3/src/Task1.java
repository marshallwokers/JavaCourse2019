import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Данное число положительное");
        } else if (number == 0) {
            System.out.println("Данное число равно 0");
        } else {
            System.out.println("Данное число отрицательное");
        }
    }
}