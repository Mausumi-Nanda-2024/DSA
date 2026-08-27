package basic_questions;

import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] merge(int[] first, int[] second) {

        int[] merged = new int[first.length + second.length];
        int firstIndex = 0, secondIndex = 0, mergedIndex = 0;

        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] <= second[secondIndex])
                merged[mergedIndex++] = first[firstIndex++];
            else
                merged[mergedIndex++] = second[secondIndex++];
        }

        while (firstIndex < first.length)
            merged[mergedIndex++] = first[firstIndex++];
        while (secondIndex < second.length)
            merged[mergedIndex++] = second[secondIndex++];

        return merged;
    }

    public static void main(String[] args) {

        int[] first = { 1, 4, 7 };
        int[] second = { 2, 3, 8 };
        System.out.println(Arrays.toString(merge(first, second))); // [1, 2, 3, 4, 7, 8]
    }
}
