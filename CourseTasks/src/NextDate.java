import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int daysInMonthCount;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonthCount = 30;
        } else if (month == 2) {
            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

            if (isLeapYear) {
                daysInMonthCount = 29;
            } else {
                daysInMonthCount = 28;
            }
        } else {
            daysInMonthCount = 31;
        }

        if (day <= 0 || month <= 0 || year <= 0 || month > 12 || day > daysInMonthCount) {
            System.out.println("Некорректная дата.");
        } else {
            if (day == daysInMonthCount) {
                day = 1;

                if (month == 12) {
                    month = 1;
                    ++year;
                } else {
                    ++month;
                }
            } else {
                ++day;
            }

            System.out.printf("Следующая дата %02d.%02d.%d", day, month, year);
        }
    }
}