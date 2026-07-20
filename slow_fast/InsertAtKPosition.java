package slow_fast;

import java.util.Scanner;

public class InsertAtKPosition {

      static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
      }

    
    public static ListNode insertAtPos(ListNode head , int val , int pos){
        if(pos<1){
            System.out.println("Invalid position.");
            return head;
        }

        ListNode newNode = new ListNode(val);

        if(pos == 1){
            newNode.next = head;
            return newNode;
        }
         ListNode prev = head;


         for(int i = 1; i<pos -1; i++){

            if(prev == null){
                System.out.println("Invalid position.");
                return head;
            }

            prev = prev.next;
         }

         if(prev == null){
             System.out.println("Invalid position.");
            return head;
         }

         newNode.next = prev.next;
         prev.next = newNode;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of existing nodes: ");
        int n = scanner.nextInt();

        ListNode head = null;
        ListNode tail = null;

        if (n > 0) {
            System.out.println("Enter " + n + " node values:");

            for (int i = 0; i < n; i++) {
                int value = scanner.nextInt();

                ListNode newNode = new ListNode(value);

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }
        }

        System.out.println("Original linked list:");
        display(head);

        System.out.print("Enter value to insert: ");
        int value = scanner.nextInt();

        System.out.print("Enter position: ");
        int position = scanner.nextInt();

        head = insertAtPos(head, value, position);

        System.out.println("Linked list after insertion:");
        display(head);

        scanner.close();
    }

    }


