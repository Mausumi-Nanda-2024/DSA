package slow_fast;

import java.util.Scanner;

public class LinkedListCycleTwo {

    // Represents one node in the linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // First part: check whether a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Slow and fast meet inside the cycle
            if (slow == fast) {
                slow = head;

                // Second part: find where the cycle begins
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
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

        // Stores references to all the created nodes
        ListNode[] nodes = new ListNode[n];

        System.out.println("Enter " + n + " node values:");

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            nodes[i] = new ListNode(value);
        }

        // Connect every node to the next node
        for (int i = 0; i < n - 1; i++) {
            nodes[i].next = nodes[i + 1];
        }

        ListNode head = nodes[0];
        ListNode tail = nodes[n - 1];

        System.out.print(
                "Enter cycle position from 0 to " + (n - 1)
                        + ", or -1 for no cycle: "
        );

        int pos = scanner.nextInt();

        // Create the cycle
        if (pos >= 0 && pos < n) {
            tail.next = nodes[pos];
        } else if (pos != -1) {
            System.out.println("Invalid cycle position.");
            scanner.close();
            return;
        }

        ListNode cycleStart = detectCycle(head);

        if (cycleStart == null) {
            System.out.println("There is no cycle.");
        } else {
            System.out.println(
                    "The cycle begins at node index " + pos
                            + " with value " + cycleStart.val
            );
        }

        scanner.close();
    }
}