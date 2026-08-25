package basic_questions;

public class GCD {

    public static int gcd(int first, int second) {

        first = Math.abs(first);
        second = Math.abs(second);

        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }

        return first;
    }

    public static void main(String[] args) {

        System.out.println(gcd(48, 18)); // 6
        System.out.println(gcd(35, 14)); // 7
    }
}