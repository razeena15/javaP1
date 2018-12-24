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

}