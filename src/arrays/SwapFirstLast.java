public class SwapFirstLast {

    // Меняет местами первый и последний элемент массива
    // Сложность: O(1)
    public static void swapFirstLast(int[] numbers) {
        if (numbers == null || numbers.length < 2) return;

        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;
    }
}
