package basic_questions;

public class LinearSearch {

    public static int search(int[] numbers, int target) {

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target)
                return index;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = { 7, 3, 9, 2, 8 };
        System.out.println(search(numbers, 9)); // 2
        System.out.println(search(numbers, 5)); // -1
    }
}
