package basic_questions;

public class CharacterCount {

    public static int[] countChars(String s) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        return freq;
    }

    public static void main(String[] args) {

        String s = "hello";
        int[] freq = countChars(s);

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) ('a' + i) + " -> " + freq[i]);
            }
        }
    }
}
