package Stacks_Queues;

import java.util.Stack;

public class ImplementationQ {
      static class Node {
          int data ;
          Node next ;
          Node prev ;

          public Node(int data) {
              this.data = data;
              this.next = null ;
              this.prev = null ;
          }
      }

      public static class queues {
          public static Node head = null ;
          public static  Node tail = null ;
          public static boolean isEmpty() {
              return head == null || tail == null ;
          }
          public static void enqueue(int data ) {
              Node newNode = new Node(data) ;
              if(tail == null) {
                  tail = head = newNode ;
                return;
               }
              tail.next = newNode ;
              tail = newNode ;
          }
          public static  int remove() {
              if(isEmpty()) {
                  System.out.println("Queue Empty") ;
                  return  -1 ;
              }
              int front = head.data ;
              if(head == tail) {
                  tail = null ;
              }
              head = head.next ;
              return front ;
          }
      }


    //    Queue Implementation using two stacks
    static class QueueY {
        static Stack<Integer> s1 = new Stack<>() ;
        static Stack<Integer> s2 = new Stack<>() ;
        public static  boolean isEmpty() {
            return s1.isEmpty()  ;
        }
        public static void add(int data ) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop()) ;
            }
            s1.push(data) ;
            while(!s2.isEmpty()) {
                s1.push(s2.pop()) ;
            }
        }
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is Empty") ;
                return -1 ;
            }
            return s1.pop() ;
        }
        public static int peek() {
            if(isEmpty()) {
                System.out.print("Queue is Empty") ;
               return -1 ;
            }
            return s1.peek() ;
        }
    }
}
