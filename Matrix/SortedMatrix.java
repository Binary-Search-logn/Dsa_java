package Matrix;

public class SortedMatrix {
//    Time Complexity of this solution is ---
    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int n = mat.length ;
        for(int i=0; i<n;i++) {
            for(int j=0; j<n; j++) {
                for(int k =0 ; k<n; k++) {
                    for(int l =0 ; l<n; l++) {
                        if(mat[i][j] < mat[k][l]) {
                            int temp = mat[i][j] ;
                            mat[i][j] = mat[k][l] ;
                            mat[k][l] = temp ;
                        }
                    }
                }
            }
        }
        System.out.println("Sorted Matrix") ;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(mat[i][j] + " ") ;
            }
            System.out.println();
        }
    }
}
