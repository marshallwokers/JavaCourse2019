public class Task1 {
    public static int getResult(int x, int y) {
        return 3 * x + 4 * y;
    }

    public static double getAverage (int begin, int end) {
        int sum = 0;
        int count = 0;

        for (int i = begin; i <= end; i++) {
            sum += i;
            ++count; }

        return (double)sum / count;
    }

    public static int getMax (int x, int y) {
        return (x > y) ? x : y;
    }

    public static int getMin (int x, int y) {
        return (x < y) ? x : y;
    }

    public static void main(String[] args) {

        System.out.println("Результат выражения: " + getResult(3, 5));

        System.out.println("Результат другого выражения: " + getResult(8, 2));

        System.out.println("Среднее арифметическое " + getAverage(2, 8));

        System.out.println("Максимум " + getMax(2, 8));

        System.out.println("Минимум " + getMin(5, 1));
    }
}