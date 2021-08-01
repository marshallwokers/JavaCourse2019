import java.util.Scanner;

public class Factorial { // считает факториал числа
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: "); // приглашение к вводу числа
        int enteredNumber = in.nextInt(); // присвоение введенного числа переменной enteredNumber

        int calculationResult = 1; // временное значение переменной результата
        for (int i = 1; i <= enteredNumber; i++) { // тело цикла: начальное значение i=1; пока i не станет равно
            // enteredNumber; i будет увеличиваться на единицу
            calculationResult = calculationResult * i; // итоговый результат
        }
        System.out.println("Результат = " + calculationResult); // вывод результата на экран
    }
}