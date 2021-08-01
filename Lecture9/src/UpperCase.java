import java.util.Arrays;

public class UpperCase {
    public static void convertStringsToUpperCase(String[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = array[i].toUpperCase();
        }
    }

    public static void main(String[] args) {
        String[] array = {"Съешь", "ещё", "этих", "мягких", "французских", "булок"};
        convertStringsToUpperCase(array);
        System.out.println(Arrays.toString(array));
    }
}