package com.stackroute;
import java.lang.String;
public class ReverseLondon {
    public String reverseString(String original)
    {
            String reverse = "";
            int length = original.length();
            for ( int i = length - 1 ; i >= 0 ; i-- )
            {
                reverse = reverse + original.charAt(i);
            }
            return reverse;

    }
}
