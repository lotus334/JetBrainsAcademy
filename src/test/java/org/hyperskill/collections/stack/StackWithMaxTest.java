package org.hyperskill.collections.stack;

import org.hyperskill.auxiliary.Input;
import org.hyperskill.auxiliary.Output;
import org.hyperskill.auxiliary.StubInput;
import org.hyperskill.auxiliary.StubOutput;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class StackWithMaxTest {
    @Test
    public void start() {
        Output out = new StubOutput();
        String[] requests = new String[] {
                "push 2",
                "push 1",
                "max",
                "pop",
                "max"
        };
        Input in = new StubInput(requests);
        StackWithMax stack = new StackWithMax(out);
        for (String req : requests) {
            stack.request(req);
        }
        assertThat(out.toString(), is(String.format(
                "2\r\n"
                + "2\r\n"
        )));
    }
}