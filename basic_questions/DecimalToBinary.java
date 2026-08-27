package basic_questions;

public class DecimalToBinary {

    public static String convert(int number) {

        if (number == 0)
            return "0";

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.append(number % 2);
            number /= 2;
        }

        return binary.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(convert(13)); // 1101
    }
}
