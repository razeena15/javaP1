package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

        @Test

        public void order()
        {
            Sorting s = new Sorting();
            int arr=s.order(234534);
            assertEquals(544332,arr);
        }
    }
