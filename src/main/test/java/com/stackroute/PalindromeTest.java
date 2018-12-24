package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome p=new Palindrome();
    @Test
    public void palindromeChecker()
    {
        String result = p.palindromeChecker(2564);
        assertEquals("is not palindrome",result);
    }

}