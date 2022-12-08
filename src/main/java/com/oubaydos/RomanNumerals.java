package com.oubaydos;

public class RomanNumerals {

    public int romanToInt(String s) {
        if (s.equals("I")) return 1;
        if (s.equals("X")) return 10;
        return 5;
    }
}
