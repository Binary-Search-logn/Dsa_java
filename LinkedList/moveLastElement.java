package LinkedList;

public class moveLastElement {
    class Node {
        int data ;
        Node next ;
        Node(int data) {
            this.data  = data ;
            next = null ;
        }
    }
    public static void moveToFront(Node head) {
        if(head == null || head.next == null) {
            return ;
        }
        Node temp = head ;
        Node secLast = null;
        while(temp.next != null) {
            secLast = temp ;
            temp  = temp.next ;
        }
        secLast.next = null ;
        temp.next = head ;
        head = temp ;
    }
    public static void main(String[] args) {

    }
}
