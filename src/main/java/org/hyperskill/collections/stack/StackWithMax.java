package org.hyperskill.collections.stack;

import org.hyperskill.auxiliary.ConsoleOutput;
import org.hyperskill.auxiliary.Output;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackWithMax {
    private Output out;
    private Deque<String> defaultStack = new ArrayDeque<>();
    private Deque<Integer> maxStack = new ArrayDeque<>();

    public StackWithMax(Output out) {
        this.out = out;
    }

    public void request(String req) {
        String action = req.split(" ")[0];
        int number;
        if (req.split(" ").length > 1) {
            number = Integer.valueOf(req.split(" ")[1]);
        } else {
            number = -1;
        }
        switch (action) {
            case "push":
                defaultStack.offerLast(String.valueOf(number));
                if (maxStack.isEmpty() || maxStack.peekLast() < number) {
                    maxStack.offerLast(number);
                } else {
                    maxStack.offerLast(maxStack.peekLast());
                }
                break;
            case "pop":
                defaultStack.pollLast();
                maxStack.pollLast();
                break;
            case "max":
                out.println(maxStack.peekLast());
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Output out = new ConsoleOutput();
        StackWithMax st = new StackWithMax(out);
        st.request("5");
    }
}
