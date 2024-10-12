package SearchingAndSorting;

import java.util.Scanner;

public class EkoSpoj {

    static boolean solve(int arr[], int n, int k, int mid) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > mid) {
                sum += arr[i] - mid;
            }
        }
         if(sum >= k) {
             return true ;
         }
         return false ;
    }

    static void heightOfTree(int arr[], int k, int n) {
        int ans = 0;
        int low = 0;
        int high = 0;
        for (int i = 0; i < n; i++) {
            high = Math.max(arr[i], high);
        }
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (solve(arr, n, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int k = 7;
        int arr[] = {20, 15, 10, 17};
        int n = arr.length;
        heightOfTree(arr, k, n) ;
    }
}
