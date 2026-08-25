package basic_questions;

public class AnagramCheck {

    public static boolean isAnagram(String first, String second) {

        if (first.length() != second.length())
            return false;

        int[] characterCounts = new int[256];
        for (int index = 0; index < first.length(); index++) {
            characterCounts[first.charAt(index)]++;
            characterCounts[second.charAt(index)]--;
        }

        for (int count : characterCounts) {
            if (count != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world")); // false
    }
}