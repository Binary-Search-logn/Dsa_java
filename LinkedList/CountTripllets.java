package LinkedList;

public class CountTripllets {
    static class Node {
        int data;
        Node next, prev;
    }

    //    This function to create a double Linked list
    static Node insert(Node head, int data) {
        // allocate node
        Node temp = new Node();

        // put in the data
        temp.data = data;
        temp.next = temp.prev = null;

        if ((head) == null)
            (head) = temp;
        else {
            temp.next = head;
            (head).prev = temp;
            (head) = temp;
        }
        return head;
    }

    static int countPairs(Node first, Node second, int value) {
        int count = 0;
        while (first != null && second != null && first != second && second.next != first) {
            if ((first.data + second.data) == value) {
                count++;
                first = first.next;
                second = second.prev;
            } else if (first.data + second.data < value) {
                first = first.next;
            } else {
                second = second.prev;
            }
        }
        return count;
    }

    static int countTriplets(Node head, int value) {
         if(head == null || head.next == null) {
             return 0 ;
         }
         Node curr, first, last ;
          first = head ;
          last = head ;
          while(last.next != null) {
              last = last.next ;
          }
          int count =0 ;
         for(curr = head ; curr!= null ; curr = curr.next ) {
             first = curr.next ;
             count += countPairs(first, last, value -curr.data) ;
         }
         return count ;
    }

    public static void main(String[] args) {
        Node head = null;

        // insert values in sorted order
        head = insert(head, 9);
        head = insert(head, 8);
        head = insert(head, 6);
        head = insert(head, 5);
        head = insert(head, 4);
        head = insert(head, 2);
        head = insert(head, 1);

        int x = 17;

        System.out.print("Count = "
                + countTriplets(head, x));
    }
    }



