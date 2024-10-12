package LinkedList;

public class CloneLinkedList {
    static class Node {
        int data ;
        Node next , random ;
        Node (int x) {
            data = x ;
            next = random = null ;
        }
    }
    static void Print (Node start ) {
        Node ptr = start ;
        while(ptr != null) {
            System.out.println("Data" + ptr.data + ", Random = " + ptr.random.data) ;
        }
    }


}
