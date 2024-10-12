package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IPAdrdress {

    private static boolean isValid(String s) {
        if (s.length() > 3
                || s.isEmpty()
                || (s.charAt(0) == '0' && s.length() > 1)
                || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }

    static List<String> computeAllValid(String str, List<String> res) {
        for (int i = 1; i <= 3 && i < str.length(); i++) {
            String first = str.substring(0, i);
            if (isValid(first)) {
                for (int j = 1; j <= 3 && i + j < str.length(); j++) {
                    String second = str.substring(i, j);
                    if (isValid(second)) {
                        for (int k = 1; k <= 3 && i + j + k < str.length(); k++) {
                            String third = str.substring(i + j, k);
                            String fourth = str.substring(i + j + k);
                            if (isValid(third) && isValid(fourth)) {
                                res.add(first + "." + second + "." + third + "." + fourth);
                            }
                        }
                    }
                }
            }
        }
        return  res ;
    }

    public static void main(String[] args) {
        String str  = "19816211" ;
        List<String> res = new ArrayList<>() ;
        computeAllValid(str, res) ;
        for(int i=0 ; i<res.size()-1 ; i++) {
            System.out.println(i) ;
        }
    }


}
