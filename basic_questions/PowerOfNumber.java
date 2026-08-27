package basic_questions;

public class PowerOfNumber {

    public static long power(int base, int exponent) {

        long result = 1;
        for (int count = 0; count < exponent; count++)
            result *= base;

        return result;
    }

    public static void main(String[] args) {

        System.out.println(power(3, 4)); // 81
    }
}
