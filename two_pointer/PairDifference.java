/** 
You are given an array of N integers and an integer K.

Your task is to determine whether there exists a pair of elements in the array such that the absolute difference between the two elements is exactly K.

You need to print:

YES if such a pair exists
NO otherwise

Input Format

The first line contains an integer N, representing the size of the array.

The second line contains N space-separated integers.

The third line contains an integer K.

Sample Input 1
6
5 20 3 2 50 80

78
Sample Output 1
YES 

**/
import java.util.Arrays;
import java.util.Scanner;

public class PairDifference {

    public static String Pair_Difference(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = 1;

        while (i < n && j < n) {
            if (i == j) {
                j++;
                continue;
            }

            int diff = arr[j] - arr[i];

            if (diff == k)
                return "Yes";
            else if (diff < k)
                j++;
            else
                i++;
        }

        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(Pair_Difference(arr, k));

        sc.close();
    }
}
