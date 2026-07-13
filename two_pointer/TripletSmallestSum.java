/*Given an array arr[] of distinct integers and a value sum, find the count of 
triplets (i, j, k), having (i<j<k) with the sum of (arr[i] + arr[j] + arr[k]) 
smaller than the given value sum.

Examples :

Input: sum = 2, arr[] = [-2, 0, 1, 3]
Output:  2
Explanation: Triplets with sum less than 2 are (-2, 0, 1) and (-2, 0, 3). 
Input: sum = 12, arr[] = [5, 1, 3, 4, 7]
Output: 4
Explanation: Triplets with sum less than 12 are (1, 3, 4), (5, 1, 3), (1, 3, 7) and (5, 1, 4).*/

import java.util.*;


public class TripletSmallestSum {

    public static int smallestSum(int[] arr , int sum){

        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;

        for(int i = 0; i< n-2; i++){

           int left = i+1;
           int right = n-1;

           while(left < right){
            int current_sum = arr[i] + arr[left] + arr[right];

            if(current_sum < sum){

                count+=right - left;
                left++;
            }else
                right--;
           }
        }

        return count;


    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        System.out.println(smallestSum(arr, sum));


        sc.close();

    }
    
}
