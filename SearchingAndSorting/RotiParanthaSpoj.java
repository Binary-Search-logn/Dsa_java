package SearchingAndSorting;

public class RotiParanthaSpoj {
    static boolean isPossible(int[] arr, int paratha, int mid) {
        int time = 0;
        int parCount = 0;
        for (int i = 0; i < arr.length; i++) {
            time = arr[i];
            int j = 2;
            while (time <= mid) {
                parCount++;
//                This represents the R, 2R , 3R , 4R
                time = time + (arr[i] * j);
                j++;
            }
            if (parCount >= paratha) return true;
        }
        return false;
    }

    static int parathaSpoj(int[] arr, int paratha) {
        int ans = -1;
        int low = 0, high = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, paratha, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }



    public static void main(String[] args) {
         int parantha = 8 ;
         int arr[] = {1} ;
        System.out.println(parathaSpoj(arr, parantha ));
    }
}
