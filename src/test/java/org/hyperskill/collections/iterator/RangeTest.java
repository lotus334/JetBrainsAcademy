package org.hyperskill.collections.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class RangeTest {

    @Test
    public void iterator() {
        Range rg =  new Range(1, 6);
        List<String> list = new ArrayList<>();
        for (Long val : rg) {
            list.add(String.valueOf(val));
        }
        assertThat(list, is(List.of("1", "2", "3", "4", "5")));
    }
}