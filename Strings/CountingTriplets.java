package Strings;

import java.util.Arrays;

public class CountingTriplets {
    static int count(int arr[], int sum) {
        Arrays.sort(arr);
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] >= sum) {
                    k--;
                } else {
                    ans += (k - j);
                    j++;
                }
            }

        }
        return ans ;
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 3, 4, 7} ;
        int sum =12 ;
         int z = count(arr, sum) ;
        System.out.println(z);
    }
}
