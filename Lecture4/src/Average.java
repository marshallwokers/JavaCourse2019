public class Average {
    public static void main(String[] args) {
        int firstNumber = 4;
        int lastNumber = 25;
        int i = firstNumber;
        int sum = 0;
        int numbersCount = 0;

        while (i <= lastNumber) {
            sum += i;
            ++numbersCount;
            ++i;
        }

        double average = (double) sum / numbersCount;
        System.out.println("Среднее арифметическое чисел от 4 до 25 равно " + average);

        i = firstNumber;
        sum = 0;
        numbersCount = 0;

        while (i <= lastNumber) {
            if (i % 2 == 0) {
                sum += i;
                ++numbersCount;
            }
            ++i;
        }

        double evenNumberAverage = (double) sum / numbersCount;
        System.out.println("Среднее арифметическое четных чисел от 4 до 25 равно " + evenNumberAverage);
    }
}