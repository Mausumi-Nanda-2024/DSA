/*
Problem Statement

You are given a sorted array of N integers.

Remove duplicate elements in-place and print the number of unique elements.

Input Format
First line: Integer N
Second line: N space-separated sorted integers

Sample Input
8
1 1 2 2 3 4 4 5
Sample Output
5
 */

import java.util.*;

public class RemoveDuplicate {

    public static int uniqueElementCount(int[] arr){

        int n=arr.length;
        int i = 0;
        int j = 1;
        int count = 1;

        while(i<n && j<n){
            if(arr[j]==arr[j-1]){
                j++;
            }
            else{
                arr[i+1] = arr[j];
                i++;
                count++;
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }

        int result = uniqueElementCount(arr);

        System.out.println(result);

        sc.close();
        

    }

    
    
}
