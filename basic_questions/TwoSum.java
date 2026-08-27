package basic_questions;

import java.util.Arrays;

public class TwoSum {

    public static int[] findPair(int[] numbers, int target) {

        for (int first = 0; first < numbers.length; first++) {
            for (int second = first + 1; second < numbers.length; second++) {
                if (numbers[first] + numbers[second] == target)
                    return new int[] { first, second };
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        int[] numbers = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(findPair(numbers, 9))); // [0, 1]
    }
}
