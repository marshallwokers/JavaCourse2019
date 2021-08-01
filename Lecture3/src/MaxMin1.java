import java.util.Scanner;

public class MaxMin1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Max = " + number1);
            System.out.println("Min = " + number2);
        } else {
            System.out.println("Max = " + number2);
            System.out.println("Min = " + number1);
        }
    }
}