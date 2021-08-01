public class CircleSquare {
    public static void main(String[] args) { // вычисляет и печатает площадь круга с заданным радиусом
        double radius = 45; // радиус
        double square = Math.pow(radius,2) * Math.PI; // произведение квадрата радиуса на число пи
        System.out.println("Для круга с радиусом " + radius + System.lineSeparator() + "площадь равна " + square);
    }
}