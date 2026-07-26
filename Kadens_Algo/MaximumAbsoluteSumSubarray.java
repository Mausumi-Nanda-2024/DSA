/*
Find the maximum absolute sum of any non-empty subarray.

The absolute sum of a subarray is:
Math.abs(sum of that subarray)

Example:
Input:
5
1 -3 2 3 -4

Output:
5

Explanation:
The subarray [2, 3] has sum 5.
Its absolute sum is |5| = 5.
*/

package Kadens_Algo;

import java.util.Scanner;

public class MaximumAbsoluteSumSubarray {

    public static int maxAbsoluteSum(int[] nums) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Maximum sum of a subarray ending at the current index.
        int maxEnding = nums[0];

        // Minimum sum of a subarray ending at the current index.
        int minEnding = nums[0];

        int maxSum = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            maxEnding = Math.max(current, maxEnding + current);
            minEnding = Math.min(current, minEnding + current);

            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);
        }

        /*
         * The answer can come from:
         * 1. The largest positive subarray sum.
         * 2. The absolute value of the smallest negative subarray sum.
         */
        return Math.max(Math.abs(maxSum), Math.abs(minSum));
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

        System.out.println(maxAbsoluteSum(nums));

        sc.close();
    }
}
