package org.robynhan.week8;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MedianSolutionTest {
    @Test
    public void should_work() {
        int median = new MedianSolution().median(new int[]{4, 5, 1, 2, 3});
        assertThat(median, is(3));
    }

}