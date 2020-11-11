package org.hyperskill.collections.set;

import org.hyperskill.auxiliary.Input;
import org.hyperskill.auxiliary.Output;

import java.util.*;

public class SpellChecker {
    private final Output out;
    private final Input in;

    public SpellChecker(Output out, Input in) {
        this.out = out;
        this.in = in;
    }

    public void printUnknownWords() {
        Set<String> wordsInTheDictionary = new HashSet<>();
        Set<String> wordsInTheText = new TreeSet<>();
        int numberOfKnown = in.askInt("");
        for (int i = 0; i < numberOfKnown; i++) {
            wordsInTheDictionary.add(in.askStr("").toLowerCase());
        }
        int numberOfTextLines = in.askInt("");
        for (int i = 0; i < numberOfTextLines; i++) {
            wordsInTheText.addAll(List.of(in.askStr("").toLowerCase().split(" ")));
        }
        for (String word : wordsInTheText) {
            if (!wordsInTheDictionary.contains(word)) {
                out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> wordsInTheDictionary = new HashSet<>();
        Set<String> wordsInTheText = new TreeSet<>();
        int numberOfKnown = Integer.valueOf(scanner.nextLine());
        System.out.println(numberOfKnown);
        for (int i = 0; i < numberOfKnown; i++) {
            wordsInTheDictionary.add(scanner.nextLine().toLowerCase());
        }
        int numberOfTextLines = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfTextLines; i++) {
            wordsInTheText.addAll(List.of(scanner.nextLine().toLowerCase().split(" ")));
        }
        for (String word : wordsInTheText) {
            if (!wordsInTheDictionary.contains(word)) {
                System.out.println(word);
            }
        }
    }

}
