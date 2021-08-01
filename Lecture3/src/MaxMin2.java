import java.util.Scanner;

public class MaxMin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        int max = (number1 > number2) ? number1 : number2;
        int min = (number1 < number2) ? number1 : number2;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}