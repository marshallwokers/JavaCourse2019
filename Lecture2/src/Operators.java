public class Operators {
    public static void main(String[] args) {
        int a = 9;
        int b = 4;

        double c = 9.0;
        double d = 4.0;

        int result1 = a + b;
        double result2 = c + d;

        int result11 = a - b;
        double result21 = c - d;

        int result13 = a * b;
        double result23 = c * d;

        int result14 = a / b;
        double result24 = c / b;

        int result15 = a % b;
        double result25 = c % d;

        double result3 = (double)a / b;

        System.out.println("9 + 4 = " + result1 + System.lineSeparator() + "9.0 + 4.0 = " + result2 + System.lineSeparator() +
                "9 - 4 = " + result11 + System.lineSeparator() + "9.0 - 4.0 = " + result21 + System.lineSeparator() +
                "9 * 4 = " + result13 + System.lineSeparator() + "9.0 * 4.0 = " + result23 + System.lineSeparator() +
                "9 / 4 = " + result14 + System.lineSeparator() + "9.0 / 4.0 = " + result24 + System.lineSeparator() +
                "9 % 4 = " + result15 + System.lineSeparator() + "9.0 % 4.0 = " + result25 + System.lineSeparator() +
                "9.0 / 4 = " + result3);
    }
}
