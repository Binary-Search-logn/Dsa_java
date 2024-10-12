package SearchingAndSorting;

public class SmallestFactorialNumber {
  static boolean check(int mid, int n) {
      int count =0 , f = 5 ;
      while(f <= mid) {
          count += mid/f ;
          f = f*5 ;
      }
      return (count >= n) ;
  }

    static int findSum(int n) {
        if(n==1) {
            return 5 ;
        }
        int low =0 ;
        int high = 5*n ;
        while(low< high) {
            int mid = (low + high) >>1 ;
            if(check(mid, n) ) {
                high = mid ;
            }
            else {
                low = mid +1 ;
            }
        }
        return low ;
    }
    public static void main(String[] args) {
        int n = 6 ;
        System.out.println(findSum(n)) ;
    }
}
