package basic_questions;

public class BinarySearch {

    public static int search(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (arr[middle] == target)
                return middle;
            if (arr[middle] < target)
                left = middle + 1;
            else
                right = middle - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 8, 12, 16, 23 };
        System.out.println(search(arr, 16)); // 4
        System.out.println(search(arr, 9)); // -1
    }
}