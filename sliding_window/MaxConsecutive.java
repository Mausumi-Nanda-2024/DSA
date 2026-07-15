/*

Given a binary array nums and an integer k, return the maximum number of 
consecutive 1's in the array if you can flip at most k 0's.

Example 1:

Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
Example 2:

Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */

package sliding_window;

import java.util.Scanner;

public class MaxConsecutive {

     public static int zeroReplacement(int[] arr , int k){

        int low = 0;
        int res = 0;
        int zeroCount = 0;

        for(int high = 0; high<arr.length; high++){
            
            if(arr[high] == 0){
                zeroCount++;
            }

            while(zeroCount > k){

                if(arr[low] == 0){
                    zeroCount--;
                }

                low++;

            }
             int len = high - low + 1;
             res = Math.max(res , len);
        }

            return res;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(zeroReplacement(arr, k));
        sc.close();
    }
    
}
