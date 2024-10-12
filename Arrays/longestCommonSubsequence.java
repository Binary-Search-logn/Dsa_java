package Arrays;

import java.util.HashSet;
import java.util.Set;

public class longestCommonSubsequence {
    public static  int longestConsective(int [] arr, int n) {
        Set<Integer> hashset= new HashSet<>();
        for(int i=0;i<n; i++) {
            hashset.add(i) ;
        }
        int longest = 0 ;
        for(int i=0; i<n; i++) {
            if(!hashset.contains(i-1)) {
                int currentNum = i ;
                int currentStreak = 1 ;
                while(hashset.contains(currentNum+1)) {
                    currentNum += 1 ;
                    currentStreak += 1 ;
                }
                longest = Math.max(longest , currentStreak) ;
            }
        }
        return longest ;
    }
    public static void main(String[] args) {
        int arr[] = {102, 4, 100, 1, 101, 3, 2} ;
        int n = arr.length ;
        System.out.println(longestConsective(arr, n));
    }
}
