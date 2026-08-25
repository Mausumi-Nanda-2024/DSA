package basic_questions;

public class LCM {

    public static int lcm(int first, int second) {

        if (first == 0 || second == 0)
            return 0;
        return Math.abs(first / GCD.gcd(first, second) * second);
    }

    public static void main(String[] args) {

        System.out.println(lcm(12, 18)); // 36
        System.out.println(lcm(7, 5)); // 35
    }
}