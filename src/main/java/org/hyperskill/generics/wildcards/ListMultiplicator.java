package org.hyperskill.generics.wildcards;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class ListMultiplicator {
    /**
     Repeats original list content provided number of times
     @param list list to repeat
     @param n times to repeat, should be zero or greater
     */
    public static void multiply(List<?> list, int n) {
        if (n == 0) {
            list.clear();
        } else {
            returnList(list, n);
            System.out.println(list);
        }
    }

    private static <T> void returnList(List<T> list, int n) {
        List<T> copied = new ArrayList<>(list);
        while (n > 1) {
            copied.forEach(el -> list.add(el));
            n--;
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        List<String> list2 = new ArrayList<>(List.of("A", "B"));
        multiply(list1, 3);
        multiply(list1, 2);
        multiply(list2, 1);
        multiply(list2, 0);

    }
}