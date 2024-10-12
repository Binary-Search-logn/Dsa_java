package SearchingAndSorting;

public class DoubleHelix {
    static  void solve(int[] first, int[] second, int m, int n) {
        // Sum of the numbers between adjacent intersections in sequence first and second,
        // respectively, and the maximum sum of the numbers in the walking path selected
        int sumFirst = 0, sumSecond = 0, sumMax = 0;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (first[i] == second[j]) {    // Intersection
                sumMax += first[i] + (Math.max(sumFirst, sumSecond));
                sumFirst = sumSecond = 0;
                i++;
                j++;
            }
            // The next intersection value is larger than the smaller one
            else if (first[i] < second[j]) {
                sumFirst += first[i];
                i++;
            } else {
                sumSecond += second[j];
                j++;
            }
        }

        // No more intersections; sum up the remaining numbers in one of the sequence
        while (i < m)
            sumFirst += first[i++];
        while (j < n)
            sumSecond += second[j++];

        // At the last intersection, select the sequence with the larger sum of numbers after it
        sumMax += Math.max(sumFirst, sumSecond);

        System.out.println(sumMax) ;
    }



    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 9, 20, 25, 30, 40, 55, 56, 57, 60, 62} ;
        int[] arr2 = {1,4, 7, 11, 14, 25, 44, 47, 55 , 57, 100 } ;
        int n = arr1.length ;
        int m = arr2.length ;
         solve(arr1, arr2 , n, m ) ;

     }
}
