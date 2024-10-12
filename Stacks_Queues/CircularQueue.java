package Stacks_Queues;

public class CircularQueue {

    public static void main(String[] args) {
        CircularArrayQueue q = new CircularArrayQueue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(q.dequeue());
        }
//       The Time Complexity of this Solution O(1) ;
//        The Space Complextiy of this Solution O(1) ;

    }

    static class CircularArrayQueue
    {

        int[] a;
        int n;
        int front = -1, rear = -1;

        public CircularArrayQueue(int n) {
            this.n = n;
            a = new int[n];
        }

        public void enqueue(int data) {
            if ((rear + 1) % n == front) {
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % n;
            a[rear] = data;
        }

        public int dequeue() {
            if (front == -1) {
                return 0;
            }
            int result = a[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % n;
            }
            return result;
        }

        public int peek() {
            int result = a[front];
            return result;
        }
    }

}
