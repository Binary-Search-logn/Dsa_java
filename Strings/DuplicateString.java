package Strings;

public class DuplicateString {
    static void fillcharcounts(String str, int count [] ) {
        for(int i=0 ; i<str.length() ; i++) {
            count[str.charAt(i)] ++ ;
        }
    }
    static void printdups(String str) {
        int count[] = new int[256] ;
        fillcharcounts(str, count) ;
        for(int i=0 ; i<256; i++ ) {
            if(count[i] >1) {
                System.out.println((char) (i) + " , count = " + count[i]) ;
            }
        }

    }

    public static void main(String[] args) {
        String str = "test string " ;
        printdups(str)  ;

    }
}
