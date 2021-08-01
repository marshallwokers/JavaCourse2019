public class LineBreak {
    public static void main(String[] args) {
        String numbersLine = "1, 2, 3, 4, 5";
        String[] numbers = numbersLine.split(", ");
        int numbersSum = 0;

        for (String s : numbers) {
            int number = Integer.parseInt(s);
            numbersSum += number;
        }

        System.out.println("Сумма чисел равна: " + numbersSum);
    }
}