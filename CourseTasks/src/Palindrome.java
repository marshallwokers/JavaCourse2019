public class Palindrome {
    public static boolean isPalindrome(String string) {
        string = string.toLowerCase();

        for (int i = 0, j = string.length() - 1; i < j; ) {
            char charFromStart = string.charAt(i);
            char charFromEnd = string.charAt(j);

            if (!Character.isLetter(charFromStart)) {
                ++i;
                continue;
            }

            if (!Character.isLetter(charFromEnd)) {
                --j;
                continue;
            }

            if (charFromStart != charFromEnd) {
                return false;
            }

            ++i;
            --j;
        }

        return true;
    }

    public static void main(String[] args) {
        String string = "";

        if (isPalindrome(string)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
