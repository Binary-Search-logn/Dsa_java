package LinkedList;

public class RotateDLL {
    static class Node {
        char data;
        Node prev;
        Node next;
    }

    static Node head = null;

    static void rotate(int N) {
        if (N == 0) {

        }
        Node curr = head;
        int count = 1;
        while (count < N && curr != null) {
            curr = curr.next;
            count++;
        }
        if (curr == null) {
            return;
        }
        Node nthNode = curr;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = head;
        head.prev = curr;
        head = nthNode.next;
        head.prev = null;
        nthNode.next = null;

    }
    static void push(char new_data)
    {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.prev = null;
        new_node.next = (head);
        if ((head) != null)
            (head).prev = new_node;
        head = new_node;
    }


    static void printList(Node node)
    {
        while (node != null && node.next != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        if(node != null)
            System.out.print(node.data);
    }


    public static void main(String[] args)
    {

        push( 'e');
        push( 'd');
        push('c');
        push('b');
        push( 'a');

        int N = 2;

        System.out.println("Given linked list ");
        printList(head);
        rotate( N);
        System.out.println();
        System.out.println("Rotated Linked list ");
        printList(head);
    }

}
