package Greedy;


import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Scanner;

 class ARRANGE {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in) ;
//        int testcases = scan.nextInt() ;
//        while(testcases --> 0) {
//
//
//            int ones = 0;
//            int n = scan.nextInt();
//            int arr[] = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = scan.nextInt();
//                if (arr[i] == 1) {
//                    ones++;
//                }
//            }
//            Arrays.sort(arr);
//            reverse(arr);
//
//            for (int i = 0; i < ones; i++) {
//                System.out.print("1");
//            }
//            if ((n - ones) == 2 && arr[0] == 3 && arr[1] == 2) {
//                System.out.print("2 3") ;
//            } else {
//                for (int i = 0; i < (n - ones); i++) {
//                    System.out.print(arr[i] + " ");
//                }
//            }
//            System.out.println();
//        }

     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in) ;
         int testcases = scan.nextInt() ;
         while(testcases -->0) {
            int n = scan.nextInt() ;
            int ones =0 ;
            int arr[] = new int[n] ;
            for(int i =0 ;i<n ;i++) {
                arr[i] = scan.nextInt() ;
                if(arr[i] == 1) {
                    ones ++ ;
                }
            }
             Arrays.sort(arr) ;
            reverse(arr) ;
            for(int i=0 ;i<ones ;i++) {
                System.out.print("1");
            }
            if((n-ones) == 2 && arr[0] ==3 && arr[1] == 2) {
                System.out.print("2 3");
            }
            else {
                for(int i=0 ;i<n-ones; i++) {
                    System.out.print(arr[i] + " ") ;
                }
            }


         }
     }





    public static void reverse(int[] array)
    {

        // Length of the array
        int n = array.length;

        // Swaping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }

}
