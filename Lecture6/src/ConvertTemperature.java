import java.util.Scanner;

public class ConvertTemperature {
    private static double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double convertToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите градусы по Цельсию: ");
        double celsius = scanner.nextDouble();

        System.out.println("Температура в Кельвинах равна " + convertToKelvin(celsius) + "K");
        System.out.println("Температура в градусах Фаренгейта равна " + convertToFahrenheit(celsius) + "F");
    }
}