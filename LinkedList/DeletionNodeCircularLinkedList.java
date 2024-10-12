package LinkedList;

public class DeletionNodeCircularLinkedList {
    static class Node {
        int data;
        Node next;
    }

    ;

    static Node push(Node head_ref, int data) {
        // Create a new node and make head as next
        // of it.
        Node ptr1 = new Node();
        ptr1.data = data;
        ptr1.next = head_ref;

        /* If linked list is not null then set the
    next of last node */
        if (head_ref != null) {
            // Find the node before head and update
            // next of it.
            Node temp = head_ref;
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = ptr1;
        } else
            ptr1.next = ptr1; /*For the first node */

        head_ref = ptr1;
        return head_ref;
    }
    static void printList (Node head) {
        Node temp = head   ;
        if(head != null) {
            do {
                System.out.printf("%d ", temp.data);
                temp = temp.next;
            } while (temp != head);
        }
    }
    static Node deletNode(Node head, int  key) {
        Node curr = head ;
        Node prev = new Node() ;
        while(curr.data != key) {
            if(curr.next == head) {
                System.out.println("List is Empty") ;
              break;
            }
            prev = curr ;
            curr = curr.next ;
        }
//        if Node is single
        if(curr == head && curr.next == head ) {
            head = null ;
            return head ;
        }
//        if Node is more than single element but curr is pointed towords the first Node
        if(curr == head ) {
            prev = head ;
            while(prev.next != head) {
                prev = prev.next ;
                head = curr.next ;
                prev.next = head ;
            }
        }
//        We will  check if the curr element is the last element
       else if(curr.next == head) {
           prev.next = head ;
       }
       else {
           prev.next = curr.next ;
        }
       return head ;
    }


    public static void main(String args[]) {
        /* Initialize lists as empty */
        Node head = null;

        /* Created linked list will be 2.5.7.8.10 */
        head = push(head, 2);
        head = push(head, 5);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 10);
        System.out.printf("List Before Deletion: ");
        printList(head);

        head = deletNode(head, 7);

        System.out.printf("List After Deletion: ");
        printList(head);

    }
}
