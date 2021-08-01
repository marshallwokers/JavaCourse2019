import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое вещественное число: ");
        double number1 = scanner.nextDouble();
        System.out.print("Введите второе вещественное число: ");
        double number2 = scanner.nextDouble();

        double error = 1.0e-10;
        if (Math.abs(number1 - number2) <= error) {
            System.out.println("Введенные числа приблизительно равны");
        } else {
            System.out.println("Введенные числа не равны");
        }
    }
}
