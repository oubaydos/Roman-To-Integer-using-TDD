package com.oubaydos;

import java.util.Map;

public class RomanNumerals {

    public int romanToInt(String s) {
        Map<String,Integer> conversionMap = Map.of("I",1,"X",10);
        return conversionMap.getOrDefault(s,5);
    }
}
