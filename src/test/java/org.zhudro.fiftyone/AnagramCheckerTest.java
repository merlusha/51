package org.zhudro.fiftyone;

import org.junit.Test;
import org.zhudro.fiftyone.functions.AnagramChecker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mikalai on 06.02.16.
 */
public class AnagramCheckerTest {

    @Test
    public void testEmpty(){
        assertFalse(AnagramChecker.isAnagram(null, "qwewqe"));
    }
    @Test
    public void testEmpty2(){
        assertFalse(AnagramChecker.isAnagram("qwew", null));
    }
    @Test
    public void testBothEmpty2(){
        assertFalse(AnagramChecker.isAnagram(null, null));
    }
    @Test
    public void testDifferentLenth(){
        assertFalse(AnagramChecker.isAnagram("12345", "123456"));
    }
    @Test
    public void testCorrect(){
        assertTrue(AnagramChecker.isAnagram("note", "tone"));
    }

    @Test
    public void testCorrect2(){
        assertTrue(AnagramChecker.isAnagram("dima", "amid"));
    }
    @Test
    public void testCorrect3(){
        assertTrue(AnagramChecker.isAnagram("dima", "idam"));
    }
}

