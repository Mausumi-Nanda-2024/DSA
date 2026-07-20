package slow_fast;

import java.util.Scanner;

public class TraversalLinkedList {

    static class ListNode{

        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void traverse(ListNode head){

        ListNode temp = head;

        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

          System.out.print("Enter the number of nodes: ");
          int n = sc.nextInt();

          if(n<=0){
            System.out.println("The linked list is empty.");
            sc.close();
            return;
          }

             System.out.println("Enter " + n + " node values:");

             int firstValue = sc.nextInt();

             ListNode head = new ListNode(firstValue);
             ListNode tail = head;

             for(int i =1 ; i<n; i++){

                int value = sc.nextInt();

                ListNode newNode = new ListNode(value);
                tail.next = newNode;
                tail = newNode;
             }

        System.out.println("Linked list elements:");

        traverse(head);



        sc.close();
        
    }
    
}
