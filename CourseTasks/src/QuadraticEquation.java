import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите коэффициент a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите коэффициент c: ");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-10;

        if (Math.abs(a) <= epsilon) {
            if (Math.abs(b) <= epsilon) {
                if (Math.abs(c) <= epsilon) {
                    System.out.print("Уравнение имеет бесконечное множество решений.");
                } else {
                    System.out.print("Уравнение не имеет решений.");
                }
            } else {
                double x = -c / b;
                System.out.print("Корень линейного уравнения равен " + x);
            }
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant < -epsilon) {
                System.out.print("Квадратное уравнение не имеет корней");
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);
                System.out.printf("Единственный корень квадратного уравнения равен %.2f", x);
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Первый корень квадратного уравнения равен %.2f, второй: %.2f", x1, x2);
            }
        }
    }
}