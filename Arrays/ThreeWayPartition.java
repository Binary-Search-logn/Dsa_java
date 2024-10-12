package Arrays;

public class ThreeWayPartition {
   public static void  swap (int arr[], int i , int j) {
      int temp = arr[i] ;
      arr[i] = arr[j] ;
      arr[j] = temp ;
   }
   public static void threewayparttion(int arr[], int a , int b) {
       int left =0 ;
       int right = arr.length -1 ;

       for(int i=0 ; i<=right ; i++) {
           if(arr[i] <a) {
               swap(arr, left, i) ;
               left ++ ;
           }

           else if(arr [i] > b) {
               swap(arr, right, i) ;
               right -- ;
               i -- ;// This is used for again Check if arr[i] > b or not
           }
       }

   }



    public static void main(String[] args) {
        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        threewayparttion(arr, 10, 20) ;
        System.out.println("Modified Array");
        for(int i=0;i<arr.length; i++ ) {
            System.out.println(arr[i] + " ") ;
        }

    }
}
