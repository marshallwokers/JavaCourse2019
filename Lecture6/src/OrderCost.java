import java.util.Scanner;

public class OrderCost {
    private static double getOrderCost(int products1Amount, int products2Amount, double product1Cost, double product2Cost) {
        double cost = product1Cost * products1Amount + product2Cost * products2Amount; // Расчет суммы товаров
        int productsAmount = products1Amount + products2Amount; // Расчет количества товаров
        final int productsAmountForDiscount = 10;
        final double productsCostForDiscount = 1000;
        final double minDiscount = 0.95;
        final double maxDiscount = 0.90;

        if (productsAmount >= productsAmountForDiscount && cost >= productsCostForDiscount) { // Скидка 10%
            return cost * maxDiscount;
        }

        if (productsAmount >= productsAmountForDiscount || cost >= productsCostForDiscount) { // Скидка 5%
            return cost * minDiscount;
        }

        return cost; // Цена без скидки
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество первого товара: ");
        int product1Amount = scanner.nextInt();

        System.out.print("Введите цену первого товара: ");
        double product1Cost = scanner.nextDouble();

        System.out.print("Введите количество второго товара: ");
        int product2Amount = scanner.nextInt();

        System.out.print("Введите цену второго товара: ");
        double product2Cost = scanner.nextDouble();

        double finalCost = getOrderCost(product1Amount, product2Amount, product1Cost, product2Cost);
        System.out.print("Стоимость заказа равна " + finalCost + " рублей");
    }
}