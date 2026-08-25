package basic_questions;

public class VowelCount {

    public static int countVowels(String text) {

        int count = 0;

        for (char character : text.toLowerCase().toCharArray()) {
            if (character == 'a' || character == 'e' || character == 'i'
                    || character == 'o' || character == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countVowels("Data Structures")); // 5
        System.out.println(countVowels("algorithm")); // 3
    }
}