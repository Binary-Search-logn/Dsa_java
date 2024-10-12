package backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class k_partitions {
    static  int counter ;
    public static void solution(int i, int n, int k, int nos, ArrayList<ArrayList<Integer>> ans) {
          if(i>n) {
              if(nos == k) {
                  counter ++ ;
                  System.out.println(counter + " ") ;
                  for(ArrayList < Integer> set : ans) {
                      System.out.print(set + " ") ;
                  }
                  System.out.println();
              }
              return ;
          }
          for(int j=0 ;j< ans.size() ; j++) {
              if(ans.get(j).size() >0 ){
                  ans.get(j).add(i) ;
                  solution(i+1, n, k, nos, ans) ;
                  ans.get(j).remove(ans.get(j).size()-1)  ;
              }
              else {
                  ans.get(j).add(i) ;
                  solution(i+1, n, k, nos+1, ans) ;
                  ans.get(j).remove(ans.get(j).size()-1) ;
                  break ;
              }
          }

    }
    public static void main(String[] args) {
           int n = 5 ;
           int k = 3 ;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i  = 0; i < k; i++) {
            ans.add(new ArrayList<>());
        }
        solution(1, n, k, 0, ans);

    }

}
