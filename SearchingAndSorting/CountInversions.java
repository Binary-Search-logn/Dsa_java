package SearchingAndSorting;

import java.util.Arrays;

public class CountInversions {


    private static int conquer(int[] arr, int l, int m, int r) {
        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
        return swaps;
    }

    static int divide(int arr[], int si, int ei) {
        int inversion = 0;
        if (si < ei) {
            int mid = (si + ei) / 2;
            inversion += divide(arr, si, mid);
            inversion += divide(arr, mid + 1, ei);
            inversion += conquer(arr, si, mid, ei);
        }
        return inversion;
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        int n = arr.length;
        System.out.println(divide(arr, 0, n - 1));
    }
}
