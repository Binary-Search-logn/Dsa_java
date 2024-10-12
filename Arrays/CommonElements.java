package Arrays;

public class CommonElements {
    public static void common(int A[], int B[], int C[], int n1, int n2, int n3) {
       int i=0 , j=0, k=0 ;
       while(i<n1 && j<n2 && k<n3) {
           if(A[i] == B[j] && B[j]== C[k]) {
               System.out.println(A[i] + " ") ;
               i++ ;
               j++ ;
               k++ ;
           }
           else if(A[i]<B[j]) {
               i++ ;
           }
           else if(B[j]<C[k]) {
               j++ ;
           }
           else {
               k++ ;
           }
       }
    }
    public static void main(String[] args) {
        int A[] = {1, 5, 10, 20, 40, 80};
        int B[]  = {6, 7, 20, 80, 100};
         int C[] = {3, 4, 15, 20, 30, 70, 80, 120};

         int n1 = A.length ;
         int n2 = B.length ;
         int n3 = C.length ;
      common(A,B,C,n1,n2,n3);
    }
}
