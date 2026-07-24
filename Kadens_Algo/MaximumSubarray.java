/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
*/

package Kadens_Algo;

import java.util.Scanner;

public class MaximumSubarray {

     public int maxSubArray(int[] nums) {

        int n = nums.length;
        int i = 0;
        int bestEnding = nums[i];
        int ans = nums[i];

        for(i =1 ; i<n ; i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.max(v1, v2);
            ans = Math.max(ans, bestEnding);
        }

        return ans;
        
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close();

    }
    
}
