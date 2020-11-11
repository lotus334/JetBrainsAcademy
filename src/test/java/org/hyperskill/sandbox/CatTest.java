package org.hyperskill.sandbox;

import org.hyperskill.auxiliary.Input;
import org.hyperskill.auxiliary.Output;
import org.hyperskill.auxiliary.StubInput;
import org.hyperskill.auxiliary.StubOutput;
import org.junit.Test;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void sayHello() {
        Output out = new StubOutput();
        Animal cat = new Cat(out);
        cat.sayHello();
        assertThat(out.toString(), is("Meow\r\n"));
    }

    @Test
    public void say() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"Hi"}
                );
        Animal cat = new Cat(out);
        String said = in.askStr("");
        ((Cat) cat).say(said);
        assertThat(out.toString(), is("str\r\n"));
    }

    @Test
    public void sayWrong() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"How are you?"}
        );
        Animal cat = new Cat(out);
        String said = in.askStr("");
        ((Cat) cat).say(said);
        assertThat(out.toString(), is("Mow-mow\r\n"));
    }
}