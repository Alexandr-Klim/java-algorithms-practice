public class LongestDigitSequence {

    // Поиск самой длинной последовательности цифр
    // Сложность: O(n)
    public static String longestDigitSequence(String text) {
        if (text == null || text.isEmpty()) return "";

        int maxLen = 0, maxStart = 0;
        int len = 0, start = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                if (len == 0) start = i;
                len++;
                if (len > maxLen) {
                    maxLen = len;
                    maxStart = start;
                }
            } else {
                len = 0;
            }
        }

        return maxLen == 0 ? "" : text.substring(maxStart, maxStart + maxLen);
    }
}
