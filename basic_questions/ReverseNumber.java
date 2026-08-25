package basic_questions;

public class ReverseNumber {

    public static int reverse(int n) {

        int reversed = 0;

        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {

        System.out.println(reverse(12345)); // 54321
        System.out.println(reverse(-908)); // -809
    }
}