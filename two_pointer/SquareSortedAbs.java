/*

Another approach for Square Sorted Array using absolute value;
 */
import java.util.*;
public class SquareSortedAbs {

    public static int[] sortedSquare(int[] arr){
        int n= arr.length;
        int i =0 ;
        int j = n-1;
        int[] ans = new int[n];
        int index = ans.length -1;
        while(i <= j){
        
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                ans[index] = arr[i] * arr[i];
                i++;
            }else{
                ans[index] = arr[j]* arr[j];
                j--;
            }
            index--;
        
        }

        return ans;
    }

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }

       System.out.println(Arrays.toString(sortedSquare(arr)));
        sc.close();
    }
    
}
