package Matrix;

public class rotatethematrix {

    public static void rotate90ClockWise(int arr[][] ){
         int n = arr.length ;

         for(int i=0; i<n; i++) {
             for(int j=0 ; j<i ; j++) {
                 int temp = arr[i][j]  ;
                 arr[i][j] = arr[j] [i] ;
                 arr[j][i] = temp ;
             }
         }
         for(int i =0; i<n; i++) {
             for(int j=0  ; j<n/2; j++) {
                 int temp = arr[i][j] ;
                 arr[i][j] = arr[i] [n-j-1] ;
                 arr[i][n-j-1] = temp ;

             }
         }

         for(int i=0 ; i<n; i++) {
             for(int j=0 ;j<n; j++) {
                 System.out.println(arr[i][j] + " ");
             }
             System.out.println();
         }

    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3, 4},
                {5,6,7,8,}
        , {9,10, 11, 12},
                {13, 14, 15, 16}} ;

        rotate90ClockWise(arr) ;

    }
}
