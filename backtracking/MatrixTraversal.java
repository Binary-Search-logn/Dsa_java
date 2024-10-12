package backtracking;

import java.util.ArrayList;
import java.util.List;

public class MatrixTraversal {
    public static void printMatrix(int mat[][] , int m , int n, int i , int j ,List<Integer> list ) {
        if(i>m && j>n ) {
            return;
        }

//                   i-1 C-1        i-1, C+1
//                          |Center|
//                   i+1 C-1       i+1 C+1
        list.add(mat[i][j]) ;
        printMatrix(mat,m, n, i+1, j, list) ;
        printMatrix(mat, m,n, i , j+1, list) ;
        list.remove(list.size()-1) ;
    }
    // Driver code
    public static void main(String[] args)
    {
        int m = 2;
        int n = 3;
        int mat[][] = { { 1, 2, 3 },
                { 4, 5, 6 } };
        List<Integer> list = new ArrayList<>();
        printMatrix(mat, m-1, n-1, 0, 0, list);
    }

}
