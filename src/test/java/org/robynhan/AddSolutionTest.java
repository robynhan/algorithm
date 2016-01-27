package org.robynhan;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddSolutionTest {
    @Test
    public void should_add(){
        AddSolution addSolution = new AddSolution();
        assertThat(addSolution.aplusb(1, 2), is(3));
        assertThat(addSolution.aplusb(100, -100), is(0));
    }
}
