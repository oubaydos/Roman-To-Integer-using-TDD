package com.oubaydos;

import java.util.Map;

public class RomanNumerals {

    public int romanToInt(String s) {
        Map<String, Integer> conversionMap = Map.of(
                "I", 1,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000,
                "V", 5,
                "IV", 4,
                "IX", 9,
                "XL", 40
        );
        int res = 0;
        char temp;
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (i < s.length() - 1 && conversionMap.containsKey(s.substring(i, i + 2))) {
                res += conversionMap.get(s.substring(i, i + 2));
                i++;
            } else
                res += conversionMap.getOrDefault(String.valueOf(temp), 0);
        }
        return res;
    }
}
