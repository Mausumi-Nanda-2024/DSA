package basic_questions;

public class FindMaximum {

    public static int findMaximum(int[] numbers) {

        int maximum = numbers[0];
        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] > maximum)
                maximum = numbers[index];
        }

        return maximum;
    }

    public static void main(String[] args) {

        int[] numbers = { 12, 5, 27, 8, 19 };
        System.out.println(findMaximum(numbers)); // 27
    }
}
