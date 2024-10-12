package Strings;

public class CountTheReversal {
    static int count(String S) {
        if(S.length()%2 !=0) {
            return -1 ;
        }
        int open =0 , close =0 , rev =0 ;
        for(int i=0 ;i<S.length(); i++) {
            if(S.charAt(i) == '{') {
                open++ ;
            }
            else {
                if(open != 0) {
                    close++ ;
                }
                else {
                    open-- ;
                }
            }
            rev = (int) (Math.ceil(open/2.0) + Math.ceil(close/2.0));

        }
        return rev ;
    }
    public static void main(String[] args) {
        String S = "}{{}}{{{" ;
        System.out.println(count(S));
    }
}
