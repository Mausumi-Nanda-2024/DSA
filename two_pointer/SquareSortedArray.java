/*
Problem Statement You are given a sorted array of integers. 
The array may contain negative numbers. 
Return the squares of each number in sorted order. 

Input Format First line: 
Integer N Second line: N space-separated sorted integers 

Sample Input -4 -1 0 3 10 
Sample Output 0 1 9 16 100 
Explanation Squares are: 16 1 0 9 100 After sorting: 0 1 9 16 100
 */

import java.util.*;

public class SquareSortedArray {

    public static List<Integer> sortedSquares(int[] arr){

    List<Integer> negative = new ArrayList<>();
    List<Integer> positive = new ArrayList<>();
   

    for(int x: arr){
        if(x < 0){
            negative.add(x);
        }
        else{
            positive.add(x);
        }
    }

    if(negative.size() == 0){
         List<Integer> res = new ArrayList<>();
        for(int x:positive){

            res.add(x*x);
            
        }

        return res;   
        
    }else if(positive.size() == 0){
         List<Integer> res = new ArrayList<>();
        for(int x:negative){
            res.add(x*x);
        }
        Collections.reverse(res);

        return res;

    }
    int n1 = negative.size();
    int n2 = positive.size();

    for(int k = 0; k < n1; k++){

        int val = negative.get(k);
        negative.set(k , val*val);
    }

    Collections.reverse(negative);

     for(int k = 0; k < n2; k++){

        int val = positive.get(k);
        positive.set(k , val*val);
    }

     List<Integer> res = new ArrayList<>(Collections.nCopies(n1+n2 ,0));

     int i = 0;
     int j = 0;
     int idx = 0;

     while(i<n1 && j<n2){
        if(negative.get(i)<positive.get(j)){

            res.set(idx++ , negative.get(i++));

        }else{
            res.set(idx++ , positive.get(j++));
        }
     }

     while(i < n1){
        res.set(idx++ , negative.get(i++));
     }
     while(j<n2){
        res.set(idx++ , positive.get(j++));
     }

     return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sortedSquares(arr));
        sc.close();
    }

    }


