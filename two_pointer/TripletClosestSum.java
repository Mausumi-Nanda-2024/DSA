/*
Given an integer array nums of length n and an integer target, find three integers 
at distinct indices in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 */

import java.util.*;
public class TripletClosestSum {

    public static int closetSum(int[] arr , int target){

        int n = arr.length;
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        int sum =0;


        for(int i =0 ; i<n-2 ; i++){

            int left = i+1;
            int right = n-1;

            while(left<right){
            int currentSum = arr[i] + arr[left] + arr[right];

            if(currentSum == target){
                return currentSum;
            }

            int currentDiff = Math.abs(currentSum - target);

            if(currentDiff < minDiff){
                minDiff = currentDiff;
                sum = currentSum;
            }

            if(currentSum < target){
                left++;
            }else
                right--;

        }

        }

        return sum;
    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int target = sc.nextInt();

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         
        System.out.println(closetSum(arr, target));
        sc.close();

    }
    
}
