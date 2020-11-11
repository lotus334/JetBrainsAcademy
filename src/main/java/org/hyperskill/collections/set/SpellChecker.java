package org.hyperskill.collections.set;

import org.hyperskill.auxiliary.Input;
import org.hyperskill.auxiliary.Output;

public class SpellChecker {
    private final Output out;
    private final Input in;

    public SpellChecker(Output out, Input in) {
        this.out = out;
        this.in = in;
    }

    public void print(String str) {
        out.println(str);
    }
}
