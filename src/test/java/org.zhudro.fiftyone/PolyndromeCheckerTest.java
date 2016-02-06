package org.zhudro.fiftyone;

import static org.junit.Assert.*;
import org.junit.Test;
import org.zhudro.fiftyone.functions.AnagramChecker;

/**
 * Created by mikalai on 06.02.16.
 */
public class PolyndromeCheckerTest {

    @Test
    public void testEmpty(){
        assertFalse(AnagramChecker.isPolyndrome(null, "qwewqe"));
    }
    @Test
    public void testEmpty2(){
        assertFalse(AnagramChecker.isPolyndrome("qwew", null));
    }
    @Test
    public void testBothEmpty2(){
        assertFalse(AnagramChecker.isPolyndrome(null, null));
    }
    @Test
    public void testDifferentLenth(){
        assertFalse(AnagramChecker.isPolyndrome("12345", "123456"));
    }
    @Test
    public void testCorrect(){
        assertTrue(AnagramChecker.isPolyndrome("12345", "54321"));
    }

}

