public class FirstDigitIndex {

    // Поиск индекса первой цифры
    // Сложность: O(n)
    public static int indexOfFirstDigit(String text) {
        if (text == null || text.isEmpty()) return -1;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
