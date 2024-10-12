package Matrix;

public class findelement {
    static boolean search(int[][] mat, int n, int x)
    {
        if (n == 0)
            return false ;

        // traverse through the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                // if the element is found
                if (mat[i][j] == x) {
                    return true ;
                }
        }

        System.out.print(" Element not found");
        return false ;
    }
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        search(mat, 4, 29);

    }



}
