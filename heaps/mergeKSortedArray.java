package heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class mergeKSortedArray {
    public static class Info implements Comparable<Info>  {
//        This is constructore to store the data , row, col number of the arr

        int data ; //10

        int row ; // 1
        int col ; //0
        Info(int data , int row , int col ) {
            this.data = data ;
            this.row = row ;
            this.col = col ;
        }

        @Override
        public int compareTo(Info o) {
            return (this.data - o.data) ;
        }
    }
//    merging the k sorted arrays
    public static ArrayList<Integer> mergeKArray (int [][] arr, int k) {
        PriorityQueue<Info> minHeap = new PriorityQueue<>() ;
        ArrayList<Integer> result = new ArrayList<>() ;
         int m = arr.length ;
         int n  = arr[0].length ;
//         arr[] [] = { 10, 20, 30} ;
//                 =  { 5,  15} ;
//                 =  {4, 9, 11}

        for(int i=0 ;i<k ; i++) {
            int element = arr[i][0] ;
//            Adding the 10 , 5, 4 elements int minheap
            minHeap.add(new Info(element, i, 0) ) ;
        }
//        Running loope size is not equls to 0 ;
        while(minHeap.size() != 0) {
//            pop() the first element in the minHeap
            Info temp = minHeap.poll() ;
//            Adding into  the result
            result.add(temp.data) ;

//            !important -- This is for checking out of the boundarayy
            if(temp.col +1 < n) {
//                For next element in the arr
                int element  = arr[temp.row][temp.col] ;
//                Adding into the min heap
                minHeap.add(new Info(element, temp.row , temp.col)) ;
            }
        }
        return result ;
    }
}
