public class Circle {
    public static void main(String[] args) {
        int knownCircleRadius = 5;
        double circleArea = Math.PI * Math.pow(knownCircleRadius, 2); /* Вычисляет площадь круга
        с заданным радиусом */
        double circlePerimeter = 2 * Math.PI * knownCircleRadius; /* Вычисляет длину окружности с заданным
        радиусом */

        double knownCircleArea = 78.5;
        double circleRadius = Math.sqrt(knownCircleArea / Math.PI); /* Вычисляет радиус с заданной
        площадью круга */

        int knownCircleRadius2 = 3;
        double circleAngle = 30;
        double circleSectorSquare = Math.PI * Math.pow(knownCircleRadius2, 2) * circleAngle / 360; /* Вычисляет
        площадь сектора круга с заданным радиусом и углом в градусах */

        System.out.println("Площадь круга с радиусом " + knownCircleRadius + " равна " + circleArea);
        System.out.println("Длина окружности с радиусом " + knownCircleRadius + " равна " + circlePerimeter);
        System.out.println("Радиус окружности с площадью " + knownCircleArea + " равен " + circleRadius);
        System.out.println("Площадь сектора круга с радиусом " + knownCircleRadius2 + " и углом " + circleAngle +
                " равна " + circleSectorSquare);
    }
}
