import java.util.Scanner;
public class Converter { // конвертирует число из десятичной системы счисления в шестнадцатеричную
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // класс для введения числа
        System.out.print("Введите целое число: "); // приглашение к вводу числа
        int decimal = in.nextInt(); // присвоение введенного числа переменной decimal
        System.out.println("Результат = " + Integer.toHexString(decimal)); // вывод введеного целого числа строкой
        // в шестнадцатеричной системе счисления
    }
}