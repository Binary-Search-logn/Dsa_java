package Greedy;

import java.util.*;

class DEFKIN {
    public static int  defenceOfKingdom(int width , int height, ArrayList<Integer> list1, ArrayList<Integer> list2 ) {
        Collections.sort(list1) ;
        Collections.sort(list2) ;
        int maX  = 0 ;
        int maY = 0 ;
        for(int i=0 ; i<list1.size()-1 ;i++) {
            maX = Math.max(maX , list1.get(i+1) - list1.get(i) -1) ;
            maY= Math.max(maY, list2.get(i+1) - list2.get(i)-1 ) ;
        }
       return maX*maY ;
    }

    public static void main(String[] args) {
//        1
//        15 8 3
//        3 8
//        11 2
//        8 6
        Scanner scan = new Scanner(System.in) ;
        int testcases = scan.nextInt() ;
        ArrayList<Integer> list1 = new ArrayList<>() ;
        ArrayList<Integer> list2 = new ArrayList<>() ;
        list1.add(0) ;
        list2.add(0) ;
        while(testcases -- >0) {
            int width = scan.nextInt() ;
            int height = scan.nextInt() ;
            int numberOfTowers =scan.nextInt() ;

            for(int i =0 ;i<numberOfTowers ;i++) {
                int x = scan.nextInt() ;
                int y = scan.nextInt() ;
                list1.add(x) ;
                list2.add(y) ;
            }
            list1.add(width+1) ;
            list2.add(height+1) ;
            int num =  defenceOfKingdom(width, height, list1, list2);
            System.out.println(num);
        }

    }
}
