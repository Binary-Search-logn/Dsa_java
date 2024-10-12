package heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SmallestWindowMaximum {

    static ArrayList<Integer> findKMaxElement(int[] arr,
                                              int K, int N)
    {
        // creating the max heap ,to get max element always
        PriorityQueue<Integer> queue = new PriorityQueue<>(
                Collections.reverseOrder());

        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;

        for (i=0 ; i < K; i++)
            queue.add(arr[i]);

        // adding the maximum element among first k elements
        res.add(queue.peek());

        // removing the first element of the array
        queue.remove(arr[0]);

        // iterarting for the next elements
        for (; i < N; i++) {

            // adding the new element in the window
            queue.add(arr[i]);

            // finding & adding the max element in the
            // current sliding window
            res.add(queue.peek());

            // finally removing the first element from front
            // end of queue
            queue.remove(arr[i - K + 1]);
        }

        return res;

        // this code is Contributed by Pradeep Mondal P
    }

    // Driver's Code
    public static void main(String[] args)
    {
        int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
        int K = 4, N = arr.length;

        // Function call
        List<Integer> res = findKMaxElement(arr, K, N);
        for (int x : res)
            System.out.print(x + " ");
    }
}
