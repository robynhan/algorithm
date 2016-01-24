package org.robynhan;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FibonacciSolutionTest {

    @Test
    public void should_be_success_if_find_with_1() {
        FibonacciSolution solution = new FibonacciSolution();
        assertThat(solution.fibonacci(1), is(0));
        assertThat(solution.fibonacci(2), is(1));
        assertThat(solution.fibonacci(47), is(1836311903));
    }
}
