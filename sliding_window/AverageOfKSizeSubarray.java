/*

Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.

 

Example 1:

Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
 */

package sliding_window;

import java.util.Scanner;

public class AverageOfKSizeSubarray {

      public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int n = arr.length;
        int low = 0;
        int high = k - 1;
        int count = 0;
        int max = k * threshold;
        int sum = 0;

        for (int i = low; i <= high; i++) {

            sum += arr[i];
        }
        while (high < n) {

        if (sum >= max) {
            count += 1;
        }
            low++;
            high++;

            if (high == n)
                break;

            sum -= arr[low - 1];
            sum += arr[high];
        }

        return count;

    }

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int k = sc.nextInt();
        int threshold = sc.nextInt();

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
         
        System.out.println(numOfSubarrays(arr, k, threshold));
        sc.close();

    }
    
}
