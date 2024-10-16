package Stacks_Queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InterleaveQueue {
    static  void interleaveQueue(Queue<Integer> q ) {
        if(q.size()%2 !=0 ) {
            System.out.println( "Input even number of intergers") ;
        }
        Stack<Integer> s = new Stack<>() ;
        int halfsize = q.size()/2 ;
        for(int i=0 ; i<halfsize ;i++) {
            s.push(q.peek()) ;
            q.poll() ;
        }
        while(!s.isEmpty()) {
            q.add(s.pop()) ;
        }
        for(int i=0 ; i<halfsize ;i++) {
            q.add(q.peek()) ;
            q.poll() ;
        }

        for(int i=0 ;i<halfsize; i++) {
            s.push(q.peek()) ;
            q.poll() ;
        }

        while(!s.isEmpty()) {
            q.add(s.pop()) ;
            q.add(q.peek()) ;
            q.poll() ;
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);
        interleaveQueue(q);
        int length = q.size();
        for (int i = 0; i < length; i++) {
            System.out.print(q.peek() + " ");
            q.poll();
        }
        int arr[] = new int[8 ] ;


    }
}
