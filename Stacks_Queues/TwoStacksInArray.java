package Stacks_Queues;

public class TwoStacksInArray {

    static  int size ;
    static int top1 , top2 ;
    static int arr[]  ;
    static void  Twostacks(int n ) {
        arr = new int[n] ;
        size = n ;
        top1 = -1 ;
        top2 = size ;
    }
    void push(int x) {
        if(top1 < top2 -1 ) {
            top1 ++ ;
            arr[top1] = x ;
        }
        else {
            System.out.println("Stack overflow")  ;
        }
    }
    void push2 (int x) {
        if(top2 < top1-1) {
            top2++ ;
            arr[top2] = x ;
        }
        else {
            System.out.println("Stack overflow") ;
        }
    }
    int pop() {
        if(top1 >=0) {
            int x = arr[top1] ;
            top1-- ;
            return x ;
        }
        else {
            System.out.println("Stack overflow") ;
        }
        return 0 ;
    }
    int pop2 () {
        if(top2>=0) {
            int y = arr[top2] ;
            top2++ ;
            return y ;
        }
        else {
            System.out.println("Stack overflow") ;
        }
        return 0 ;
    }
}
