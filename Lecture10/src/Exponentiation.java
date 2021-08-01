public class Exponentiation {
    public static int exponentiationWithRecursion(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return exponentiationWithRecursion(number, power - 1) * number;
    }

    public static int exponentiationWithoutRecursion(int number, int power) {
        int result = 1;

        for (int i = 1; i <= power; ++i) {
            result *= number;
        }

        return result;
    }

    public static void main(String[] args) {
        int number = 2;
        int power = 4;
        System.out.println("Возведение в степень с рекурсией: " + exponentiationWithRecursion(number, power));
        System.out.println("Возведение в степень без рекурсии: " + exponentiationWithoutRecursion(number, power));
    }
}