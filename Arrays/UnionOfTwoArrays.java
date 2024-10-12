package Arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {

    public static int union(int arr1[], int arr2[],  int n, int m ) {
        int i =0 , j =0;
        while(i<m && j<n) {
            if(arr1[i]< arr2[j]) {
                System.out.println(arr1[i++] + " ");
            }
            else if(arr2[j] < arr1[i]) {
                System.out.println(arr2[j++] + " ") ;
            }
            else {
                System.out.println(arr2[j++] + " ") ;
                i++ ;
            }
        }
        while(i<m) {
            System.out.println(arr1[i++] + " ") ;
        }
        while(j<n) {
            System.out.println(arr2[j++] + " ");
        }
        return 0 ;
    }
    public static void intersection (int arr1[], int arr2[], int n, int m) {

     int i =0 ,  j=0;
     while(i<m && j<n) {
         if(arr1[i]<arr2[j] ) {
             i++ ;
         }
         else if ( arr1[i]> arr2[j]) {
             j++ ;
         }
         else if(arr1[i] == arr2[j])   {
             System.out.println(arr2[j++]);
             i++ ;
         }
     }
    }


    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        union(arr1, arr2, n, m) ;
        System.out.println();
        intersection(arr1, arr2, n, m ) ;

    }
}
