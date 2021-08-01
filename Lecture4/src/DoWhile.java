public class DoWhile {
    public static void main(String[] args) {
        int firstNumber = 4;
        int lastNumber = 25;
        int i = firstNumber;
        int sum = 0;
        int numbersCount = 0;

        do {
            sum += i;
            ++numbersCount;
            ++i;
        } while (i <= lastNumber);

        double average = (double) sum / numbersCount;
        System.out.println("Среднее арифметическое чисел от 4 до 25 равно " + average);

        i = firstNumber;
        sum = 0;
        numbersCount = 0;

        do {
            if (i % 2 == 0) {
                sum += i;
                ++numbersCount;
            }
            ++i;
        } while (i <= lastNumber);

        double evenNumberAverage = (double) sum / numbersCount;
        System.out.println("Среднее арифметическое четных чисел от 4 до 25 равно " + evenNumberAverage);
    }
}