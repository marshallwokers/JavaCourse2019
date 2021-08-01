import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) { // проверка на четность
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        if (number % 5 == 0) {
            System.out.println("Число кратно 5");
        } else {
            System.out.println("Число не кратно 5");
        }
        }
    }