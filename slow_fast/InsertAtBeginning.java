package slow_fast;

import java.util.Scanner;

public class InsertAtBeginning {

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode insertAtBeginning(ListNode head, int value) {

        ListNode newNode = new ListNode(value);

        newNode.next = head;

        head = newNode;

        return head;
    }

    public static void display(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListNode head = null;

        System.out.print("Enter the number of existing nodes: ");
        int n = sc.nextInt();

        ListNode tail = null;

        System.out.println("Enter the node values:");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Original linked list:");
        display(head);

        System.out.print("Enter the value to insert at the beginning: ");
        int value = sc.nextInt();

        head = insertAtBeginning(head, value);

        System.out.println("Linked list after insertion:");
        display(head);

        sc.close();
    }
}
