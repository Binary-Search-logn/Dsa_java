package LinkedList;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListRecur {
     static  Node head ;
    static class  Node {
           int data  ;
           Node next ;
           Node(int data) {
               this.data = data ;
               this.next = null ;
           }
    }


    /* Function to print linked list */
    public static void printSinglyLinkedList(Node node,
                                             String sep) throws IOException {
        while (node != null) {
            System.out.print(String.valueOf(node.data) + sep);
            node = node.next;
        }
    }

    // Complete the reverse function below.
    static Node reverse(Node head) {

        if(head == null) {
            return head;
        }

        // last node or only one node
        if(head.next == null) {
            return head;
        }

        Node newHeadNode = reverse(head.next);

        // change references for middle chain
        head.next.next = head;
        head.next = null;
        // send back new head node in every recursion
        return newHeadNode;
    }




}
