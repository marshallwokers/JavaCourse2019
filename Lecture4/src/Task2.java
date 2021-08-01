public class Task2 {
    public static void main(String[] args) {
        int i = 3;// счетчик цикла
        int sum = 0;
        int evenNumberCount = 0;
        while (i <= 21) {
            if (i % 2 == 0) {
                sum += i;
                evenNumberCount += 1;
            }
            ++i;
        }
        System.out.println("Сумма четных чисел от 3 до 21 равна " + sum);
        System.out.println("Количество четных чисел от 3 до 21 равно " + evenNumberCount);
    }
}
