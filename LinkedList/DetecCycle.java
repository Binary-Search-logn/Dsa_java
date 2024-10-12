package LinkedList;


import java.util.LinkedList;

public class DetecCycle {
    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }
    }

    static Node detectCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }

    static Node detectFirstNode(Node head) {
        Node meet = detectCycle(head);
        Node start = head;
        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start;
    }




}
