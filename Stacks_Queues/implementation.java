package Stacks_Queues;

import java.util.Stack;

public class implementation {
     static class Node {
          int data ;
          Node next ;
          public Node(int data) {
               this.data = data;
               this.next = null ;
          }
     }
     public static class stack {
          public static Node  head ;
          public static boolean isEmpty() {
               return head == null ;
          }
          public static void push ( int data ) {
                Node newNode = new Node(data) ;
               if(isEmpty()) {
                   newNode = head ;
               }
               newNode.next = head ;
               head = newNode ;
          }
          public static int  pop() {
               if(isEmpty()) {
                    return -1 ;
               }
               int top = head.data ;
               head = head.next ;
               return top ;
          }
          public static  int peek() {
               if(isEmpty()) {
                    return -1 ;
               }
               return  head.data ;
          }

     }

     public static void main(String[] args) {
//          stack s = new stack() ;
//          s.push(1) ;
//          s.push(2) ;
//          s.push(3) ;
//          s.push(4) ;
//          s.push(5) ;
       QueueUsingStack s = new QueueUsingStack() ;
       s.push(1) ;
       s.push(2) ;
       s.push(3) ;
       s.push(4) ;
          System.out.println(s.peek());
     }

     public static void PushAtBottom (int data , Stack<Integer> s ) {
          if(s.isEmpty()) {
               s.push(data) ;
              return ;
          }
          int top = s.pop() ;
          PushAtBottom(data , s) ;
          s.push(top) ;

     }
     static class QueueUsingStack {
          static Stack<Integer> input = new Stack<>() ;
          static Stack<Integer> output = new Stack<>() ;
          public void push(int x ) {
               System.out.print("Element is pushed " + x);
               System.out.println();
               input.push(x) ;
          }
          public int pop() {
               if(!output.isEmpty()) {
                   output.pop() ;
               }
               else {
                    while(!input.isEmpty()){
                         output.push(input.peek()) ;
                         input.pop() ;
                    }
               }
               return output.pop() ;
          }
          public int peek() {
               if(!output.isEmpty()) {
                    return output.peek() ;
               }
               else {
                    while(!input.isEmpty()) {
                         output.push(input.peek()) ;
                         input.pop() ;
                    }
               }
               return output.peek() ;
          }
     }
}
