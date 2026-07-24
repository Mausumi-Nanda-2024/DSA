package Kadens_Algo;

public class MinSumSubarray {
     public static int minSubarraySum(int[] nums) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Minimum sum of a subarray ending at the current index.
        int minEnding = nums[0];

        // Minimum subarray sum found anywhere so far.
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            // Choice 1: Start a new subarray from current.
            // Choice 2: Continue the previous subarray.
            minEnding = Math.min(
                    current,
                    minEnding + current
            );

            result = Math.min(result, minEnding);
        }

        return result;
    }
}
