package Stacks_Queues;

public class MiddleElement {

    static class Node  {
        Node prev ;
        int data ;
        Node next  ;
        Node(int data ) {
            this.data = data ;
        }
    }
    public class myStack {
        Node head ;
        Node mid ;
        Node prev ;
        Node next ;
        int size ;

        void push(int data) {
            Node newNode = new Node(data) ;
            if(size ==0 ) {
                head = newNode  ;
                mid = newNode ;
                size++ ;
                return;
            }
            head.next = newNode ;
            newNode.prev = head ;
            head = head.next ;
            if(size %2 != 0) {
                mid = mid.next ;
            }
            size ++ ;
        }
         int pop() {
            int data = -1 ;
            if(size ==0) {
                System.out.println("Stack is Empty");
            }
            if(size == 1) {
                head = null ;
                mid = null ;
            }
            else {
                data = head.data; ;
                head = head.prev ;
                head.next = null ;
                if(size %2 ==0 ) {
                    mid  = mid.prev ;
                }
                size -- ;
            }
         return data ;
        }
    }


}
