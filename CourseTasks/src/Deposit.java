import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        double startingDeposit = scanner.nextDouble();

        System.out.print("Введите годовой процент: ");
        double interestRate = scanner.nextDouble();

        System.out.print("Введите срок вклада: ");
        int depositPeriod = scanner.nextInt();

        System.out.println();
        System.out.print("Месяц   |");

        for (int i = 1; i <= depositPeriod; ++i) {
            System.out.printf("%9d |", i);
        }

        System.out.println();
        System.out.print("---------");

        for (int i = 1; i <= depositPeriod; ++i) {
            System.out.print("-----------");
        }

        System.out.println();
        System.out.print("Прибыль |");

        final int monthsInYearCount = 12;
        final int maxPercent = 100;
        double interestRateRatio = interestRate / maxPercent;
        double deposit = startingDeposit;

        for (int i = 1; i <= depositPeriod; ++i) {
            double profit = deposit * (interestRateRatio / monthsInYearCount);
            deposit += profit;
            System.out.printf("%9.2f |", profit);
        }

        double totalProfit = deposit - startingDeposit;

        System.out.printf("%n%nСумма вклада на конец периода: %.2f%n", deposit);
        System.out.printf("Суммарная прибыль: %.2f", totalProfit);
    }
}