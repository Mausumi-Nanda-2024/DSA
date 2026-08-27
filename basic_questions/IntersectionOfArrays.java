package basic_questions;

import java.util.Arrays;

public class IntersectionOfArrays {

    public static int[] findIntersection(int[] first, int[] second) {

        int[] intersection = new int[Math.min(first.length, second.length)];
        int intersectionSize = 0;

        for (int firstNumber : first) {
            for (int secondNumber : second) {
                if (firstNumber == secondNumber) {
                    intersection[intersectionSize++] = firstNumber;
                    break;
                }
            }
        }

        return Arrays.copyOf(intersection, intersectionSize);
    }

    public static void main(String[] args) {

        int[] first = { 1, 2, 3, 4 };
        int[] second = { 3, 4, 5, 6 };
        System.out.println(Arrays.toString(findIntersection(first, second))); // [3, 4]
    }
}
