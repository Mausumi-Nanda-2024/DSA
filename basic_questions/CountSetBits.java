package basic_questions;

public class CountSetBits {

    public static int count(int number) {

        int setBits = 0;
        while (number > 0) {
            setBits += number & 1;
            number >>= 1;
        }

        return setBits;
    }

    public static void main(String[] args) {

        System.out.println(count(13)); // 3 because 13 is 1101 in binary
    }
}
