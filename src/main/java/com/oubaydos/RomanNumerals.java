package com.oubaydos;

import java.util.Map;

public class RomanNumerals {

    public int romanToInt(String s) {
        Map<String, Integer> conversionMap = Map.of("I", 1, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000, "V", 5, "IV", 4);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'I' && i < s.length() - 1 && conversionMap.containsKey(s.substring(i, i + 2))) {
                res += conversionMap.get(s.substring(i, i + 2));
                i++;
            } else
                res += conversionMap.getOrDefault(String.valueOf(s.charAt(i)), 0);
        }
        return res;
    }
}
