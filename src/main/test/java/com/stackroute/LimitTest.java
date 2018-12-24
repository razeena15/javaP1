package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class LimitTest {
    Limit l=new Limit();
    @Test
    public void guessNumbe()

    {
        String result = l.guessNumber(15);
        assertEquals("Number guessed is equal to original number     ",result);
    }
@Test
    public void guessNum()

    {
        String result = l.guessNumber(25);
        assertEquals("Number guessed is more than original number     ",result);
    }
@Test
    public void guessNumber()

    {
        String result = l.guessNumber(10);
        assertEquals("Number guessed is less than original number     ",result);
    }

}