import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        double lenght = scanner.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double width = scanner.nextDouble();

        double area = lenght * width; //Вычисляет площадь прямоугольника
        double perimeter = 2 * (lenght + width); // Вычисляет периметр прямоугольника

        System.out.printf("Площадь %.0f%nПериметр %.0f", area, perimeter);
    }
}