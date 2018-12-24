package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.String;

public class ReverseLondonTest {
    ReverseLondon r= new ReverseLondon();;

    @Test
    public void reverse()
    {
        assertEquals("nodnol",r.reverseString("london"));
    }

}