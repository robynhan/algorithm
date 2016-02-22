package org.robynhan;

import org.junit.Test;
import org.robynhan.week4.CompareStringSolution;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class week4Test {
    @Test
    public void should_compareStrings() {
        CompareStringSolution solution = new CompareStringSolution();
        assertTrue(solution.compareStrings("ABCD", "ACD"));
        assertFalse(solution.compareStrings("ABCD", "AABC"));
    }
}
