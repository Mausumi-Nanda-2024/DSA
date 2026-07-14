/*
Given an array of positive integers nums and a positive integer target, 
return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
 */



package sliding_window;
import java.util.*;

public class MinSumSubarray {

    public static int minSum(int[] arr , int target){
        int sum = 0;
        int low = 0;
        int res = Integer.MAX_VALUE;

        int n = arr.length;

        for(int high = 0; high < n; high++){

            sum += arr[high];

            while(sum >= target){
                int len  = high - low + 1;
                res = Math.min(res , len);
                sum-=arr[low];
                low++;
            }

            high++;

        }

        return res;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int target_sum = sc.nextInt();

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         
        System.out.println(minSum(arr, target_sum));
        sc.close();


    }
    
}
