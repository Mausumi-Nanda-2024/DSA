/*
Find the maximum sum of a non-empty subarray in a circular array.

In a circular array, the subarray may continue from the end of the array
to the beginning.

Example:
Input:
3
5 -3 5

Output:
10

Explanation:
The circular subarray [5, 5] has the maximum sum.
*/

package Kadens_Algo;

import java.util.Scanner;

public class CircularMaxSumSubarray {

    public static int maxSubarraySumCircular(int[] nums) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int totalSum = nums[0];

        // Kadane's algorithm for the maximum subarray sum.
        int maxEnding = nums[0];
        int maxSum = nums[0];

        // Kadane's algorithm for the minimum subarray sum.
        int minEnding = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            maxEnding = Math.max(current, maxEnding + current);
            maxSum = Math.max(maxSum, maxEnding);

            minEnding = Math.min(current, minEnding + current);
            minSum = Math.min(minSum, minEnding);

            totalSum += current;
        }

        /*
         * If every number is negative, totalSum - minSum becomes 0.
         * That represents an empty subarray, which is not allowed.
         */
        if (maxSum < 0) {
            return maxSum;
        }

        // Circular maximum = total sum - minimum subarray sum.
        int circularMaxSum = totalSum - minSum;

        return Math.max(maxSum, circularMaxSum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            sc.close();
            throw new IllegalArgumentException("Array size must be positive");
        }

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(maxSubarraySumCircular(nums));

        sc.close();
    }
}
