package basic_questions;

public class Factorial {

    public static long factorial(int n) {

        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));  // 120
        System.out.println(factorial(10)); // 3628800
    }
}
