public class ArrayAverage {
    public static double getEvenNumbersAverage(int[] array) {
        int sum = 0;
        int amount = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                sum += e;
                ++amount;
            }
        }

        return (double) sum / amount;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Среднее арифметическое четных чисел массива равно: " + getEvenNumbersAverage(array));
    }
}