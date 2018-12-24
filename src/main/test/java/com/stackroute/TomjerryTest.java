package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomjerryTest {

    Tomjerry t=new Tomjerry();
    @Test
    public void tomJerry()
    {
        String result=t.tomJerry(25);
        assertEquals("Jerry",result);

    }



}