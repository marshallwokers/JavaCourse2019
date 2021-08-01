import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите координаты первой точки: %n");
        System.out.print("x = ");
        double x1 = scanner.nextDouble();
        System.out.print("y = ");
        double y1 = scanner.nextDouble();

        System.out.printf("Введите координаты второй точки: %n");
        System.out.print("x = ");
        double x2 = scanner.nextDouble();
        System.out.print("y = ");
        double y2 = scanner.nextDouble();

        System.out.printf("Введите координаты третьей точки: %n");
        System.out.print("x = ");
        double x3 = scanner.nextDouble();
        System.out.print("y = ");
        double y3 = scanner.nextDouble();

        double epsilon = 1.0e-10;
        if (Math.abs((x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1)) <= epsilon) {
            System.out.println("Вершины треугольника лежат на одной прямой");
        } else {
            double aSideLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Длина стороны a
            double bSideLength = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)); // Длина стороны b
            double cSideLength = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)); // Длина стороны c
            double halfPerimeter = (aSideLength + bSideLength + cSideLength) / 2; // Полупериметр
            double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - aSideLength) * (halfPerimeter - bSideLength)
                    * (halfPerimeter - cSideLength)); // Формула Герона

            System.out.println("Площадь треугольника равна " + triangleArea);
        }
    }
}