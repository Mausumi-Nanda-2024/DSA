package basic_questions;

public class CheckSortedArray {

    public static boolean isSorted(int[] numbers) {

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] < numbers[index - 1])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isSorted(new int[] { 1, 2, 2, 5, 9 })); // true
        System.out.println(isSorted(new int[] { 1, 4, 3, 6 })); // false
    }
}
