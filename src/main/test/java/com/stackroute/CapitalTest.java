package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalTest {
    Capital c=new Capital();
    @Test
    public void character()
    {
        String result = c.character('A');
        assertEquals("Character is a capital letter",result);
    }
 @Test
    public void chaa()
    {
        String result = c.character('a');
        assertEquals("Character is a small letter",result);
    }
 @Test
    public void chap()
    {
        String result = c.character('0');
        assertEquals("Character is a digit",result);
    }
 @Test
    public void chara()
    {
        String result = c.character('#');
        assertEquals("Character is a special symbol",result);
    }


}