package basic_questions;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] numbers) {

        if (numbers.length == 0)
            return 0;

        int uniqueCount = 1;
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] != numbers[index - 1])
                numbers[uniqueCount++] = numbers[index];
        }

        return uniqueCount;
    }

    public static void main(String[] args) {

        int[] numbers = { 1, 1, 2, 2, 3, 4, 4 };
        int length = removeDuplicates(numbers);
        System.out.println(Arrays.toString(Arrays.copyOf(numbers, length))); // [1, 2, 3, 4]
    }
}
