package Strings;

public class binaryString {
    public static int maxSubstr(String str, int n) {
        int x = 0 , y = 0 ;
        int c = 0 ;
        for(int i=0; i<n ; i++) {
            if(str.charAt(i) == '0') {
                x++ ;
            }
            else  {
                y++ ;
            }
            if( x== y) {
                c++ ;
            }
        }
        if( x!= y) {
           return -1 ;
        }
//        System.out.println(c) ;
         return c ;
    }
    public static void main(String[] args) {
        String str = "0100110101" ;
        int n = str.length() ;
        System.out.println(maxSubstr(str, n)) ;
    }
}
