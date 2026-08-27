package basic_questions;

import java.util.Arrays;

public class MoveZeros {

    public static void moveToEnd(int[] numbers) {

        int nextNonZero = 0;
        for (int number : numbers) {
            if (number != 0)
                numbers[nextNonZero++] = number;
        }

        while (nextNonZero < numbers.length)
            numbers[nextNonZero++] = 0;
    }

    public static void main(String[] args) {

        int[] numbers = { 0, 1, 0, 3, 12 };
        moveToEnd(numbers);
        System.out.println(Arrays.toString(numbers)); // [1, 3, 12, 0, 0]
    }
}
