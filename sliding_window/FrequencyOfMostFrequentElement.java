/*
The frequency of an element is the number of times it occurs in an array.

You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.

Return the maximum possible frequency of an element after performing at most k operations.

 

Example 1:

Input: nums = [1,2,4], k = 5
Output: 3
Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
4 has a frequency of 3.


*/


package sliding_window;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfMostFrequentElement {

     public static int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;
        int low = 0;
        long sum = 0;
        int result = 0;

        for (int high = 0; high < n; high++) {

            sum += nums[high];

            while (
                (long) nums[high] * (high - low + 1) - sum > k
            ) {
                sum -= nums[low];
                low++;
            }

            int currLen = high - low + 1;

            result = Math.max(result, currLen);
        }

        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(maxFrequency(arr, k));
        sc.close();
    }
    
}
