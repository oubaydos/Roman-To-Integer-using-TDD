package com.oubaydos;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class RomanNumerals {

    public int romanToInt(String s) {
        Map<String, Integer> conversionMap = new HashMap<>() {{
            put("I", 1);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
            put("V", 5);
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
        }};
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
