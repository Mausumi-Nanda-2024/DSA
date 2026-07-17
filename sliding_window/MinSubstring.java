/*

Given two strings s and t of lengths m and n respectively,
 return the minimum window substring of s such that every character in t (including duplicates) is included in the window. 
 If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

 

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.
 */


package sliding_window;

public class MinSubstring {

    public static String minSubString(String s , String t){

        int[] need = new int[256];
        int[] have = new int[256];

        for(int i = 0; i < t.length(); i++){
            need[t.charAt(i)]++;

        }

        int low =0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        for(int high = 0; high< s.length() ; high++ ){

            have[s.charAt(high)]++;

            while(isCorrect(have , need)){
                int current_len = high + low - 1;

                if(current_len < minLen){
                    minLen = current_len;
                    startIndex = low;
                }

                have[s.charAt(low)]--;
                low++;
            }
        }

        if(minLen == Integer.MAX_VALUE ){
            return "";
        }else{
            return s.substring(startIndex , minLen);
        }
    }

    public static boolean isCorrect(int[] have, int[] need) {

        for (int i = 0; i < 256; i++) {

            if (have[i] < need[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){

    }
    
}
