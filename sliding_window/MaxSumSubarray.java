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
