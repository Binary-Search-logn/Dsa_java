package LinkedList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Non_Repeating {
    public static void printFirstNonRepeatingCharacters(char[] stream) {
        HashMap<Character, Integer> map = new HashMap<>() ;
        Queue<Character> q = new LinkedList<>() ;

        for(int i=0 ; i<stream.length ; i++) {
            map.put(stream[i], map.getOrDefault(stream[i], 0) +1) ;
            if(map.get(stream[i]) == 1) {
                q.add(stream[i]) ;
            }
            while(!q.isEmpty()) {
                char c = q.peek() ;

                if(map.get(c) == 1) {
                    break ;
                }
                else {
                    q.remove();
                }
            }
            if(q.isEmpty()){
                System.out.println(-1 + " ") ;
            }
            else {
                System.out.println(q.peek() + " ")  ;
            }

        }
    }

    public static void main(String[] args) {
        char[] stream = {'a', 'a', 'b', 'c', 'c', 'd', 'b', 'a', 'd'};
       printFirstNonRepeatingCharacters(stream) ;
    }
}
