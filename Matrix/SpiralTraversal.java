package Matrix;

public class SpiralTraversal {
    public static void spiralPrint(int a[][]) {
        int top, bottom, left, right, dir;


        //Intialize
        top = 0;
        bottom = a.length - 1;
        left = 0;
        right = a[0].length - 1;
        dir = 0;
        int i;

        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (i = left; i <= right; i++) {
                    System.out.println(a[top][i]);
                }
                top += 1;
            } else if (dir == 1) {
                for (i = top; i <= bottom; i++) {
                    System.out.println(a[i][right]);
                }
                right -= 1;
            } else if (dir == 2) {
                 for( i = right  ; i>= left ; i--) {
                     System.out.println(a[bottom][i]) ;
                 }
                bottom -= 1;
            } else if (dir == 3) {
                for( i= bottom ; i>=top ; i--){
                    System.out.println(a[i][left]) ;
                }
                left += 1;
            }
           dir = (dir + 1) % 4 ;
        }

    }
        public static void main (String[]args){
            int a[][] = {{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
            spiralPrint(a);
        }
    }
