/*

Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
*/

package slow_fast;

import java.util.*;

public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        

    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The linked list is empty.");
            System.out.println("Cycle present: false");
            scanner.close();
            return;
        }

        System.out.println("Enter " + n + " node values:");

        // Create the first node
        int firstValue = scanner.nextInt();
        ListNode head = new ListNode(firstValue);
        ListNode tail = head;

        // Stores references to all nodes
        ListNode[] nodes = new ListNode[n];
        nodes[0] = head;

        // Create and connect the remaining nodes
        for (int i = 1; i < n; i++) {
            int value = scanner.nextInt();

            ListNode newNode = new ListNode(value);

            tail.next = newNode;
            tail = newNode;

            nodes[i] = newNode;
        }

        System.out.print(
            "Enter cycle position from 0 to " + (n - 1)
            + ", or -1 for no cycle: "
        );

        int pos = scanner.nextInt();

        if (pos >= 0 && pos < n) {
            tail.next = nodes[pos];
        } else if (pos != -1) {
            System.out.println("Invalid cycle position.");
            scanner.close();
            return;
        }

        boolean result = hasCycle(head);

        System.out.println("Cycle present: " + result);

        scanner.close();
    }

}
