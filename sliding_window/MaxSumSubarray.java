/*
Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array.

Examples:

Input: arr[] = [100, 200, 300, 400], k = 2
Output: 700
Explanation: arr2 + arr3 = 700, which is maximum.
Input: arr[] = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Output: 39
Explanation: arr1 + arr2 + arr3 + arr4 = 39, which is maximum.
 */

package sliding_window;

import java.util.*;;

public class MaxSumSubarray {

    public static int maxSum(int[] arr, int k) {

        int n = arr.length;

        int low = 0;
        int high = k - 1;
        int sum = 0;
        int res = Integer.MIN_VALUE;

        for (int i = low; i <= high; i++) {

            sum += arr[i];

        }

        while (high < n) {
            res = Math.max(res, sum);

            low++;
            high++;

            if (high == n)
                break;

            sum = sum - arr[low - 1];
            sum = sum + arr[high];

        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int k = sc.nextInt();

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         
        System.out.println(maxSum(arr, k));
        sc.close();

    }

}
