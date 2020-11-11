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
    public void validPrintUnknownWords() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{
                        "3",
                        "a",
                        "bb",
                        "cCc",
                        "2",
                        "a bb aab aba ccc",
                        "c bb aaa"
                }
                );
        SpellChecker checker = new SpellChecker(out, in);
        checker.printUnknownWords();
        String ls = System.lineSeparator();
        assertThat(out.toString(), is(
                String.format(
                        "aaa\r\n"
                        + "aab\r\n"
                        + "aba\r\n"
                        + "c\r\n"
                )
        ));
    }
}