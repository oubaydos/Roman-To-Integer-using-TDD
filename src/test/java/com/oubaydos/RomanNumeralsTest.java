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
    @Test
    public void shouldReturn5GivenV() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(5, romanNumerals.romanToInt("V"));
    }
    @Test
    public void shouldReturn10GivenX() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(10, romanNumerals.romanToInt("X"));
    }
    @Test
    public void shouldReturn50GivenL() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(50, romanNumerals.romanToInt("L"));
    }
    @Test
    public void shouldReturn100GivenC() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(100, romanNumerals.romanToInt("C"));
    }
    @Test
    public void shouldReturn500GivenD() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(500, romanNumerals.romanToInt("D"));
    }
    @Test
    public void shouldReturn1000GivenM() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(1000, romanNumerals.romanToInt("M"));
    }
    @Test
    public void shouldReturn2GivenII() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(2, romanNumerals.romanToInt("II"));
    }
    @Test
    public void shouldReturn4GivenIV() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(4, romanNumerals.romanToInt("IV"));
    }
    @Test
    public void shouldReturn9GivenIX() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(9, romanNumerals.romanToInt("IX"));
    }
    @Test
    public void shouldReturn40GivenXL() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(40, romanNumerals.romanToInt("XL"));
    }
    @Test
    public void shouldReturn90GivenXC() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(90, romanNumerals.romanToInt("XC"));
    }
    @Test
    public void shouldReturn400GivenCD() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals(400, romanNumerals.romanToInt("CD"));
    }
}