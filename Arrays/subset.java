package Arrays;

import java.util.HashSet;
import java.util.Set;

public class subset {

    public static boolean isSubset(int arr1[],int arr2[], int n1, int n2) {
        Set<Integer> hashset = new HashSet<>() ;

        for (int i=0;i<n1; i++) {
            if(!hashset.contains(arr1[i])){
                hashset.add(arr1[i]) ;
            }
        }
        for(int i=0;i<n2;i++) {
            if(!hashset.contains(arr2[i])){
                return false ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 4, 9, 9, 2 };
        int n1 = arr1.length ;
        int n2 = arr2.length ;
        System.out.println(isSubset(arr1, arr2, n1, n2) );
    }
}
