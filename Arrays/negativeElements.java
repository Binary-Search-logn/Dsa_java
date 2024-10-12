package Arrays;

public class negativeElements {
    static void rearrange(int arr[], int n ) {
        int j=0 , temp ;
        for(int i =0; i<n ; i++) {
            if(arr[i]<0) {
                if(i !=j) {
                    temp = arr[i] ;
                    arr[i]  = arr[j] ;
                    arr[j] = temp ;
                }
                j++  ;
            }
        }
    }

    static void print(int arr[], int n) {
        for(int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, -3, -7, 4, 5, 6,2, 8, 9} ;
        int n = arr.length ;
       rearrange(arr, n);
       print(arr, n);
    }
}
