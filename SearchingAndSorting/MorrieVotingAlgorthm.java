package SearchingAndSorting;

public class MorrieVotingAlgorthm {
    static boolean majority(int arr[], int size){
        int number =0 ;
        int z = findcand(arr, size) ;
        for(int i=0 ; i<size ;i++) {
            if(arr[i] == z) {
                number ++ ;
            }
        }
        if(number> size/2) {
            return  true ;
        }
        return false ;
    }
    static int findcand(int arr[], int size) {
        int max_index = 0 , count = 1 ;
        int i ;
        for( i=0 ; i<size ; i++) {
            if(arr[max_index] == arr[i]){
                count ++ ;
            }
            else {
                count-- ;
            }
            if(count ==0) {
                max_index = i ;
                count ++ ;
            }
        }
        return arr[max_index] ;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2, 3,1} ;
         int n = arr.length ;
        boolean z = majority(arr, n) ;
        System.out.println(z) ;
    }
}
