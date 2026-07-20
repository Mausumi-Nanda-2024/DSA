/*

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
 */

package slow_fast;

import java.util.Scanner;

public class MiddleOfLinkedList {

     // Represents one node in the linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode middleNode(ListNode head) {

       ListNode slow = head;
       ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Prints the list starting from the given node
    public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The linked list is empty.");
            scanner.close();
            return;
        }

        System.out.println("Enter " + n + " node values:");

        // Create the first node
        int firstValue = scanner.nextInt();

        ListNode head = new ListNode(firstValue);
        ListNode tail = head;

        // Create and connect the remaining nodes
        for (int i = 1; i < n; i++) {
            int value = scanner.nextInt();

            ListNode newNode = new ListNode(value);

            tail.next = newNode;
            tail = newNode;
        }

        System.out.print("Linked list: ");
        printList(head);

        MiddleOfLinkedList solution = new MiddleOfLinkedList();

        ListNode middle = solution.middleNode(head);

        System.out.println("Middle node value: " + middle.val);

        System.out.print("List starting from the middle node: ");
        printList(middle);

        scanner.close();

    }
    
}
