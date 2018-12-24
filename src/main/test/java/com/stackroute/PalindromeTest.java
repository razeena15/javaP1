package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome p=new Palindrome();
    @Test
    public void palindromeChcker()
    {
        String result = p.palindromeChecker(252);
        assertEquals("is a palindrome and the sum of even numbers is less than 25",result);
    }
    @Test
    public void palindromeCheker()
    {
        String result = p.palindromeChecker(2564);
        assertEquals("is not palindrome",result);
    }

}