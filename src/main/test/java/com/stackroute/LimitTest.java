package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class LimitTest {
    Limit l=new Limit();
    @Test
    public void guessNumber()

    {
        String result = l.guessNumber(15);
        assertEquals("Number guessed is equal to original number     ",result);
    }

}