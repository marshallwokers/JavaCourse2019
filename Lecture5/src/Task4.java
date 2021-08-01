public class Task4 {
    public static void main(String[] args) {
        int firstNumber = 4;
        int lastNumber = 25;
        int i = firstNumber;
        int sum = 0;
        int NumberCount = 0;

        for (; i <= lastNumber; ++i) {
            sum += i;
            NumberCount += 1;
        }

        double average = (double) sum / NumberCount;
        System.out.println("Среднее арифметическое чисел от 4 до 25 равно " + average);
    }
}
