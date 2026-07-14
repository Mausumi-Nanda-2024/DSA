/*
You are given a string s consisting only lowercase alphabets and an integer k. Your task is to 
find the length of the longest substring that contains exactly k distinct characters.

Note : If no such substring exists, return -1. 

Examples:

Input: s = "aabacbebebe", k = 3
Output: 7
Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.

 */

package sliding_window;

import java.util.*;

public class LongestSubstring {

    public static int longestSubstring(String str , int k){
        int low = 0;
        int maxLen = 0;

        Map<Character , Integer> freq = new HashMap<>();

        for(int high =0; high < str.length() ; high++){

            char highCharacter = str.charAt(high);

            freq.put(highCharacter ,freq.getOrDefault(highCharacter , 0)+1);


            while(freq.size() > k){
                char lowCharacter = str.charAt(low);

                freq.put(lowCharacter , freq.get(lowCharacter)-1);

                if(freq.get(lowCharacter) == 0){
                    freq.remove(lowCharacter);

                }

                low++;
            }

            if(freq.size() == k){
                int currentLen = high - low + 1;
                 maxLen = Math.max(maxLen , currentLen);
            }

        }

        return maxLen;


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

        System.out.println(longestSubstring(s, k));

        sc.close();

    }
    
}
