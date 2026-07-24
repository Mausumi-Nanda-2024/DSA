package Kadens_Algo;

public class MaxProductSubarray {

    public static int maxProductSubarray(int[] nums) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int maxEnding = nums[0];
        int minEnding = nums[0];

        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];

            // Save previous values before updating them.
            int previousMax = maxEnding;
            int previousMin = minEnding;

            // Three choices:
            // 1. Start new from current.
            // 2. Current × previous maximum.
            // 3. Current × previous minimum.
            int startNew = current;
            int continueFromMax = current * previousMax;
            int continueFromMin = current * previousMin;

            maxEnding = Math.max(
                    startNew,
                    Math.max(continueFromMax, continueFromMin)
            );

            minEnding = Math.min(
                    startNew,
                    Math.min(continueFromMax, continueFromMin)
            );

            result = Math.max(result, maxEnding);
        }

        return result;
    }
    
}
