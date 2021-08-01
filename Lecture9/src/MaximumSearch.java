public class MaximumSearch {
    public static double getMax(double[] array) {
        double maxNumber = array[0];

        for (double e : array) {
            maxNumber = Math.max(maxNumber, e);
        }

        return maxNumber;
    }

    public static void main(String[] args) {
        double[] array = {1, 13, 8, 3, 11, 6};
        System.out.println("Максимальное число массива: " + getMax(array));
    }
}