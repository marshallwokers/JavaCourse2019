import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; ++i) {
            System.out.print((i*i) + " ");
        }
    }
}
