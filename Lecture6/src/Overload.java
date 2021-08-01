public class Overload {
    private static int getTypeSize(byte x) {
        return 1;
    }

    private static int getTypeSize(short x) {
        return 2;
    }

    private static int getTypeSize(int x) {
        return 4;
    }

    private static int getTypeSize(long x) {
        return 8;
    }

    private static int getTypeSize(float x) {
        return 4;
    }

    private static int getTypeSize(double x) {
        return 8;
    }

    public static void main(String[] args) {
        byte byteTypeVariable = 127;
        short shortTypeVariable = 32767;
        int intTypeVariable = 2147483647;
        long longTypeVariable = 9223372036854775807L;
        float floatTypeVariable = 3.4e+38f;
        double doubleTypeVariable = 1.7e+308;

        System.out.println("Количество байт в переменной типа byte: " + getTypeSize(byteTypeVariable));
        System.out.println("Количество байт в переменной типа short: " + getTypeSize(shortTypeVariable));
        System.out.println("Количество байт в переменной типа int: " + getTypeSize(intTypeVariable));
        System.out.println("Количество байт в переменной типа long: " + getTypeSize(longTypeVariable));
        System.out.println("Количество байт в переменной типа float: " + getTypeSize(floatTypeVariable));
        System.out.println("Количество байт в переменной типа double: " + getTypeSize(doubleTypeVariable));
    }
}