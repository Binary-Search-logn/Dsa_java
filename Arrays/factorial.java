package Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {


    public static BigInteger factorials(int N) {


        BigInteger f = new BigInteger("1");
          for(int i=2 ; i<=N; i++) {
              f = f.multiply(BigInteger.valueOf(i));
          }
          return f ;
    }


    public static void main(String[] args) {
        int N = 20 ;
        System.out.println(factorials(N));
    }
}
