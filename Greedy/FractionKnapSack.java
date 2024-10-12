package Greedy;

import java.util.PriorityQueue;

public class FractionKnapSack {


    public static String chooseandswap(String s){
        PriorityQueue<Character > ar = new PriorityQueue <Character>();
        for(int i=0; i< s.length(); i++) if(!ar.contains(s.charAt(i))) ar.add(s.charAt(i));
        for(int i=0; i< s.length(); i++){
            char a= s.charAt(i);
            ar.remove(a);
            if( !ar.isEmpty() && Character.compare(a,ar.peek())>0 ){
                s= s.replace(a, '*');
                s= s.replace(ar.peek(), a);
                s= s.replace('*', ar.peek());
                break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String arr = "ccad" ;
        chooseandswap(arr);
    }
}
