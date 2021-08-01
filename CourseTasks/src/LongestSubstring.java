public class LongestSubstring {
    public static int getLongestSubstringLength(String string) {
        if (string.length() <= 1) {
            return string.length();
        }

        string = string.toLowerCase();
        int length = 1;
        int maxLength = 0;

        for (int i = 1; i < string.length(); ++i) {
            if (string.charAt(i - 1) == string.charAt(i)) {
                ++length;
            } else {
                length = 1;
                continue;
            }

            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String string = "аАаАаббдеггггв";
        System.out.println("Размер максимальной подстроки равен " + getLongestSubstringLength(string));
    }
}