/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2

*/

package slow_fast;

import java.util.Scanner;

public class DuplicateNumbers {

    public static int findDuplicate(int[] nums){

        int slow = 0;
        int fast = 0;

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast) break;
        }

        slow = 0;

        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        } 

        return slow;


    }

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(findDuplicate(arr));

        sc.close();
    }
    
}
