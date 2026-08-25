package basic_questions;

public class SumOfDigits {

    public static int sumOfDigits(int n) {

        n = Math.abs(n);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(sumOfDigits(12345)); // 15
        System.out.println(sumOfDigits(908)); // 17
    }
}