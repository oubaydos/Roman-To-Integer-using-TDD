package com.oubaydos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RomanNumeralsTest {
    @Test
    public void shouldHaveRomanToInt() {
        RomanNumerals romanNumerals = new RomanNumerals();
        romanNumerals.romanToInt("");
    }
    @Test
    public void shouldReturn1GivenI() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(1, romanNumerals.romanToInt("I"));
    }

}