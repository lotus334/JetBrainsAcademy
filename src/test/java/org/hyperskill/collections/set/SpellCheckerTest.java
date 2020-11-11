package org.hyperskill.collections.set;

import org.hyperskill.auxiliary.Input;
import org.hyperskill.auxiliary.Output;
import org.hyperskill.auxiliary.StubInput;
import org.hyperskill.auxiliary.StubOutput;
import org.junit.Test;
import static org.hamcrest.Matchers.is;


import static org.junit.Assert.*;

public class SpellCheckerTest {
    @Test
    public void validPrint() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one sentence"}
                );
        SpellChecker checker = new SpellChecker(out, in);
        checker.print("one sentence");
        assertThat(out.toString(), is("one sentence\r\n"));
    }
}