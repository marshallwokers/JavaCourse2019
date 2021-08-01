import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int userYear = scanner.nextInt();

        if (((userYear % 4 == 0) && (userYear % 100 != 0)) || (userYear % 400 == 0)) {
            System.out.println("Введенный год является високосным");
        } else {
            System.out.println("Введенный год не является високосным");
        }
    }
}