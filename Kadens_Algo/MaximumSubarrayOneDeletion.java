package Kadens_Algo;

public class MaximumSubarrayOneDeletion {

     public static int maximumSum(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Best sum with no deletion used.
        int noDelete = arr[0];

        // Invalid initially because deleting the only element
        // would leave an empty subarray.
        int oneDelete = Integer.MIN_VALUE;

        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];

            // Preserve previous states.
            int previousNoDelete = noDelete;
            int previousOneDelete = oneDelete;

            // Standard Kadane transition.
            noDelete = Math.max(
                previousNoDelete + current,
                current
            );

            /*
             * Option 1:
             * Deletion happened earlier.
             * Continue by adding current.
             *
             * Option 2:
             * Delete current.
             * Keep previousNoDelete unchanged.
             */
            if (previousOneDelete == Integer.MIN_VALUE) {
                oneDelete = previousNoDelete;
            } else {
                oneDelete = Math.max(
                    previousOneDelete + current,
                    previousNoDelete
                );
            }

            result = Math.max(
                result,
                Math.max(noDelete, oneDelete)
            );
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 0, 3};

        System.out.println(maximumSum(arr));
    }
    
}
