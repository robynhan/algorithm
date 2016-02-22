package org.robynhan;

import org.junit.Test;
import org.robynhan.week4.ClimbingStairsSolution;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClimbingStairsSolutionTest {
    ClimbingStairsSolution solution = new ClimbingStairsSolution();

    @Test
    public void should_work() {
        assertThat(solution.climbStairs(0), is(1));
        assertThat(solution.climbStairs(1), is(1));
        assertThat(solution.climbStairs(2), is(2));
        assertThat(solution.climbStairs(3), is(3));
    }
}
