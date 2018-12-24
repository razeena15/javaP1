package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {

       Loop lp = new Loop();

        @Test

        public void loop() {
            int result = lp.loop(5);
            assertEquals(6, result);
        }

        //@Test
       // public void loop() {
          //  int result = lp.loop(7);
         //   assertEquals(0, result);
       // }


}
