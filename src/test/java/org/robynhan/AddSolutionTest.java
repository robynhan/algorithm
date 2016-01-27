package org.robynhan;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddSolutionTest {
    AddSolution addSolution = new AddSolution();

    @Test
    public void should_add(){
        assertThat(addSolution.aplusb(1, 2), is(3));
        assertThat(addSolution.aplusb(100, -100), is(0));
    }

    @Test
    public void should_add_binary() {
        BinaryAddSolution addSolution = new BinaryAddSolution();
        assertThat(addSolution.addBinary("11", "1"), is("100"));
    }
}
