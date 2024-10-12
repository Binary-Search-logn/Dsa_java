package Greedy;

public class PickingUpChiks {
    public static void pickingUpChicks(int n, int k, int b, int time, int X[], int V[]) {
        int count =0 ;
        int swaps = 0 ;
        int not_possible = 0 ;
        for(int i=n-1 ; i>=0 ; i--) {
            int distance_needed = b-X[i] ;
            int distance_possible = V[i] * time ;

            if(distance_possible >= distance_needed) {
                count++ ;
                if(not_possible > 0) {
                    swaps+= not_possible ;
                }
            }
            else {
                not_possible++ ;
            }
            if(count >=k) {
                break;
            }
        }
        if(count>=k) {
            System.out.print(swaps) ;
        }
        else {
            System.out.print("Impossible") ;
        }
    }
    public static void main(String[] args) {
//        N = number of Chicks
//        k = how many chicks inside the bar
//        b = X Coordinate of the barn
//        t = Time Required to all This
//        X[i] respresents the coordinated of al the chicks
//        Y[i] respresents the speed of all chicks
       int n =5 ;
       int k =3 ;
       int b = 10 ;
       int time = 5 ;
       int x[]  = {0 ,2, 5, 6, 7} ;
       int y [] = {1, 1, 1 ,1, 4} ;
       pickingUpChicks(n, k, b,time, x, y ) ;
    }
}
