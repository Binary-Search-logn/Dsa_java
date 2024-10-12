package SearchingAndSorting;

public class SearchElementRoatedSortedArray {
    static int search(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[low] <= arr[mid]) {
            if (key >= arr[low] && key <= arr[mid]) {
                return search(arr, low, mid - 1, key);
            } else {
                return search(arr, mid + 1, high, key);
            }
        } else {
            if (key >= arr[mid] && key <= arr[high]) {
                return search(arr, mid + 1, high, key);
            }
            return search(arr, low, mid - 1, key);
        }
    }
}
