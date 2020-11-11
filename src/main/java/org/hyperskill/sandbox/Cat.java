package org.hyperskill.sandbox;

import org.hyperskill.auxiliary.Output;

public class Cat extends Animal {
    private final Output out;

    public Cat(Output out) {
        this.out = out;
    }

    int age = 3;

    @Override
    void sayHello() {
        out.println("Meow");
    }

    void say(String str) {
        if (str.equals("Hi")) {
            out.println("str");
        } else {
            out.println("Mow-mow");
        }
    }
}
