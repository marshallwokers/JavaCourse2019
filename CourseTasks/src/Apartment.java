import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество подъездов: ");
        int entrancesAmount = scanner.nextInt();
        System.out.println("Введите количество этажей: ");
        int floorsAmount = scanner.nextInt();
        System.out.println("Введите номер квартиры: ");
        int flatNumber = scanner.nextInt();

        final int flatsOnFloor = 4; // Количество квартир на этаже
        int flatsInEntrance = flatsOnFloor * floorsAmount;  // Количество квартир в подъезде

        if (flatNumber <= 0 || flatNumber > entrancesAmount * flatsInEntrance) {
            System.out.println("Квартиры с таким номером нет в доме");
        } else {
            int entranceNumber = (int) Math.ceil((double) flatNumber / flatsInEntrance); // Номер подъезда
            int flatNumberInEntrance = flatsInEntrance - (entranceNumber * flatsInEntrance - flatNumber); /* Порядковый
        номер квартиры в подъезде */
            int floorNumber = (int) Math.ceil((double) flatNumberInEntrance / flatsOnFloor); // Номер этажа
            int flatPosition = flatNumber % flatsOnFloor; // Положение квартиры на этаже

            System.out.println("Номер подъезда: " + entranceNumber);
            System.out.println("Номер этажа: " + floorNumber);

            if (flatPosition == 0) {
                System.out.println("Положение квартиры: ближняя справа");
            } else if (flatPosition == 1) {
                System.out.println("Положение квартиры: ближняя слева");
            } else if (flatPosition == 2) {
                System.out.println("Положение квартиры: дальняя слева");
            } else {
                System.out.println("Положение квартиры: дальняя справа");
            }
        }
    }
}