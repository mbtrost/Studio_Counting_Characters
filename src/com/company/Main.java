package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void countingCharacters(String String) {

        HashMap<Character, Integer> countCharMap = new HashMap<Character, Integer>();

        char[] stringArray = String.toCharArray();

        for (char c : stringArray) {
            if (countCharMap.containsKey(c)) {
                countCharMap.put(c, countCharMap.get(c) + 1);
            } else {
                countCharMap.put(c, 1);
            }
        }

        for (Map.Entry entry : countCharMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        countingCharacters(hiddenFigures);
    }
}
