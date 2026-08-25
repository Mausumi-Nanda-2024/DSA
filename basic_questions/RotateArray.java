package basic_questions;

import java.util.Arrays;

public class RotateArray {

    public static void rotateRight(int[] arr, int positions) {

        if (arr.length == 0)
            return;
        positions %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, positions - 1);
        reverse(arr, positions, arr.length - 1);
    }

    private static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temporary = arr[left];
            arr[left] = arr[right];
            arr[right] = temporary;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        rotateRight(arr, 2);
        System.out.println(Arrays.toString(arr)); // [4, 5, 1, 2, 3]
    }
}