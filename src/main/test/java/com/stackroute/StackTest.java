package com.stackroute;

import org.junit.Test;

import java.lang.String;

import static org.junit.Assert.*;

public class StackTest {

    Stack s=new Stack();
    @Test
    public void stackRoute()
    {
        String result = s.stackRoute("Razeena",2);
        assertEquals("Razeenaaneane",result);
    }
}

