public class TenNumbersInLine_Easy {
    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 100;
        int i = firstNumber;

        while (i <= lastNumber) {
            if (i % 10 != 0) {
                System.out.printf("%d ", i);
            } else {
                System.out.printf("%d%n", i);
            }
            ++i;
        }
    }
}
