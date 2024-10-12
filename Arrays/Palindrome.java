package Arrays;

import java.lang.reflect.Parameter;

public class Palindrome {
    public static int PalinArray(int arr[], int n ) {
        int ans =0 ;
        for(int i=0; i<n; i++) {

            int temp = arr[i]  ;
            while(temp>0) {
                int r = temp%10 ;
                temp /= 10 ;

                ans = (ans*10) +r ;
            }
            if(ans != arr[i]) {
                return 0 ;
            }
        }
        return  1 ;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2,1} ;
        int n = arr.length ;
        System.out.println(PalinArray(arr, n)  );
    }
}
