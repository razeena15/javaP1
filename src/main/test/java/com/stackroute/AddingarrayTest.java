package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddingarrayTest {


    Addingarray a= new Addingarray();;
    @Test
    public void arrayAdderOne()
    {

        int[] var= {3, 4, 5, 6, 7};
        assertEquals(25,a.arrayAdder(var));
    }


}