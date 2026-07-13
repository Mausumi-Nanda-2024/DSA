/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Input: nums = [-1,0,1,2,-1,-4] 
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
 */

import java.util.*;

public class TripletSum {

    public static List<List<Integer>> sumTriplet(int[] arr){
        
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();


        for(int i = 0; i<n-2; i++){

            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }

            int left = i+1;
            int right = n-1;
            int target = -arr[i];

            while(left < right){
                int current_sum = arr[left] + arr[right];

                if(current_sum == target){
                    result.add(Arrays.asList(arr[i] , arr[left] , arr[right]));

                    left++;
                    right--;

                    while(left < right && arr[left] == arr[left -1]){
                        left++;
                    }

                    while(left<right && arr[right] ==arr[right-1]){
                        right--;
                    }
                }else if(current_sum < target){
                    left++;
                }else{
                    right--;
                }
            }
            
            
        }

        return result;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0 ; i<n ; i++){

            arr[i] = sc.nextInt();

        }

        System.out.println(sumTriplet(arr));

        sc.close();

    }

}
