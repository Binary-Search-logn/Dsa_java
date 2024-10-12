package Matrix;

public class SpecificPairInMatrix {
    public static int findMaxValue(int N, int mat[][] ) {
        int maxValue = Integer.MIN_VALUE ;
        for(int i=0; i<N-1; i++) {
            for(int j=0; j<N-1; j++) {
                for(int k = i+1; k<N; k++) {
                    for(int e = j+1 ; e<N; e++ ) {
                        if(maxValue<(mat[k][e] - mat[i][j]) ) {
                            maxValue = mat[k][e] - mat[i][j] ;
                        }
                    }
                }
            }
        }
        return maxValue ;
    }
    public static void main(String[] args) {
        int N = 5;

        int mat[][] = {
                { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 6, 1, 3 },
                { -4, -1, 1, 7, -6 },
                { 0, -4, 10, -5, 1 }
        };

        System.out.print("Maximum Value is " +
                findMaxValue(N,mat));
    }
}
