package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {

       Loop lp = new Loop();

        @Test

        public void loop() {
            int result = lp.loop(5);
            assertEquals("1,2,2,3,3,3,4,4,4,4,5,5,5,5,5", result);
        }

        //@Test
       // public void loop() {
          //  int result = lp.loop(7);
         //   assertEquals(0, result);
       // }


}
