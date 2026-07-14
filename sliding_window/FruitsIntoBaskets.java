/*
You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.

Example 2:

Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
 */

package sliding_window;

import java.util.*;

public class FruitsIntoBaskets {

    public static int atMostFruits(int[] arr, int k) {
        int low = 0;
        int maxLen = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int high = 0; high < arr.length; high++) {
            freq.put(arr[high], freq.getOrDefault(arr[high], 0) + 1);

            while (freq.size() > k) {
                freq.put(arr[low], freq.get(arr[low]) - 1);
                if (freq.get(arr[low]) == 0)
                    freq.remove(arr[low]);
                low++;
            }

            maxLen = Math.max(maxLen, high - low + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fruits = new int[n];

        for (int i = 0; i < n; i++)
            fruits[i] = sc.nextInt();

        System.out.println(atMostFruits(fruits, 2));

        sc.close();
    }
}
