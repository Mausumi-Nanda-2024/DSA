package basic_questions;

public class SecondLargest {

    public static int secondLargest(int[] arr) {

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 20, 15};
        System.out.println(secondLargest(arr)); // 15
    }
}
