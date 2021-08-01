public class MultiplicationTable {
    public static void main(String[] args) {
        int rowsCount = 10;
        int columnsCount = 5;

        System.out.print("    |");

        for (int i = 1; i <= columnsCount; ++i) {
            System.out.printf("%3d ", i);
        }

        System.out.println();
        System.out.print("-----");

        for (int i = 1; i <= columnsCount; ++i) {
            System.out.print("----");
        }

        System.out.println();

        for (int i = 1; i <= rowsCount; ++i) {
            System.out.printf("%3d |", i);

            for (int j = 1; j <= columnsCount; ++j) {
                System.out.printf("%3d ", i * j);
            }

            System.out.println();
        }
    }
}