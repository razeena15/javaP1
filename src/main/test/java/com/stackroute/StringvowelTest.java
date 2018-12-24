package com.stackroute;

import org.junit.Test;
import java.lang.String.*;


import static org.junit.Assert.*;



public class StringvowelTest {

    @Test
    public void stringChecker()
    {
        Stringvowel check = new Stringvowel();
        String result =check.stringChecker("a");
        assertEquals("vowel",result);

    }
    @Test
    public void CheckTest1()
    {
        Stringvowel check = new Stringvowel();
        String result =check.stringChecker("@");
        assertEquals("consonant",result);
    }
}

