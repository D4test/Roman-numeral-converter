package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenNumberIs_1Then_I() { assertEquals("I", Converter.convertArabicToRoman(1)); }

    @Test
    public void whenNumberIs_2Then_II() {
        assertEquals("II", Converter.convertArabicToRoman(2));
    }

    @Test
    public void whenNumberIs_3Then_III() {
        assertEquals("III", Converter.convertArabicToRoman(3));
    }

    @Test
    public void whenNumberIs_4Then_IV() {
        assertEquals("IV", Converter.convertArabicToRoman(4));
    }

    @Test
    public void whenNumberIs_5Then_V() {
        assertEquals("V", Converter.convertArabicToRoman(5));
    }

    @Test
    public void whenNumberIs_6Then_VI() {
        assertEquals("VI", Converter.convertArabicToRoman(6));
    }

    @Test
    public void whenNumberIs_7Then_VII() {
        assertEquals("VII", Converter.convertArabicToRoman(7));
    }

    @Test
    public void whenNumberIs_8Then_VIII() {
        assertEquals("VIII", Converter.convertArabicToRoman(8));
    }

    @Test
    public void whenNumberIs_9Then_IX() {
        assertEquals("IX", Converter.convertArabicToRoman(9));
    }

    @Test
    public void whenNumberIs_10Then_X() {
        assertEquals("X", Converter.convertArabicToRoman(10));
    }

    @Test
    public void whenNumberIs_14Then_XIV() {
        assertEquals("XIV", Converter.convertArabicToRoman(14));
    }

    @Test
    public void whenNumberIs_15Then_XV() {
        assertEquals("XV", Converter.convertArabicToRoman(15));
    }

    @Test
    public void whenNumberIs_19Then_XIX() {
        assertEquals("XIX", Converter.convertArabicToRoman(19));
    }

    @Test
    public void whenNumberIs_20Then_XX() {
        assertEquals("XX", Converter.convertArabicToRoman(20));
    }

    @Test
    public void whenNumberIs_24Then_XXIV() {
        assertEquals("XXIV", Converter.convertArabicToRoman(24));
    }

    @Test
    public void whenNumberIs_25Then_XXV() {
        assertEquals("XXV", Converter.convertArabicToRoman(25));
    }

    @Test
    public void whenNumberIs_29Then_XXIX() {
        assertEquals("XXIX", Converter.convertArabicToRoman(29));
    }

    @Test
    public void whenNumberIs_30Then_XXX() {
        assertEquals("XXX", Converter.convertArabicToRoman(30));
    }

    @Test
    public void whenNumberIs_50Then_L() {
        assertEquals("L", Converter.convertArabicToRoman(50));
    }

    @Test
    public void whenNumberIs_100Then_C() {
        assertEquals("C", Converter.convertArabicToRoman(100));
    }
    @Test
    public void whenNumberIs_150Then_CL() {
        assertEquals("CL", Converter.convertArabicToRoman(150));
    }

    @Test
    public void whenNumberIs_200Then_CC() {
        assertEquals("CC", Converter.convertArabicToRoman(200));
    }

    @Test
    public void whenNumberIs_300Then_CCC() {
        assertEquals("CCC", Converter.convertArabicToRoman(300));
    }

    @Test
    public void whenNumberIs_500Then_D() {
        assertEquals("D", Converter.convertArabicToRoman(500));
    }

    @Test
    public void whenNumberIs_999Then_CMXCIX() {
        assertEquals("CMXCIX", Converter.convertArabicToRoman(999));
    }

    @Test
    public void whenNumberIs_1000Then_M() {
        assertEquals("M", Converter.convertArabicToRoman(1000));
    }

    @Test
    public void whenNumberIs_1500Then_MD() {
        assertEquals("MD", Converter.convertArabicToRoman(1500));
    }

    @Test
    public void whenNumberIs_2000Then_MM() {
        assertEquals("MM", Converter.convertArabicToRoman(2000));
    }

    @Test
    public void whenNumberIs_3000Then_MMM() {
        assertEquals("MMM", Converter.convertArabicToRoman(3000));
    }

    @Test
    public void whenNumberIs_5000Then_v() {
        assertEquals("v", Converter.convertArabicToRoman(5000));
    }

    @Test
    public void whenNumberIs_9999Then_vMvCMXCIX() {
        assertEquals("vMvCMXCIX", Converter.convertArabicToRoman(9999));
    }

    @Test
    public void whenNumberIs_10000Then_x() {
        assertEquals("x", Converter.convertArabicToRoman(10000));
    }

    @Test
    public void whenNumberIs_50000Then_l() {
        assertEquals("l", Converter.convertArabicToRoman(50000));
    }

    @Test
    public void whenNumberIs_100000Then_c() {
        assertEquals("c", Converter.convertArabicToRoman(100000));
    }

    @Test
    public void whenNumberIs_111111Then_cxMCXI() {
        assertEquals("cxMCXI", Converter.convertArabicToRoman(111111));
    }

    @Test
    public void whenNumberIs_150000Then_cl() {
        assertEquals("cl", Converter.convertArabicToRoman(150000));
    }

    @Test
    public void whenNumberIs_500000Then_D() {
        assertEquals("d", Converter.convertArabicToRoman(500000));
    }

    @Test
    public void whenNumberIs_1000000Then_M() {
        assertEquals("m", Converter.convertArabicToRoman(1000000));
    }

    @Test
    public void whenNumberIs_3999999Then_mmmcmxcvMvCMXCIX() { assertEquals("mmmcmxcvMvCMXCIX", Converter.convertArabicToRoman(3999999)); }

    @Test
    public void whenNumberIs_4000000Then_Null() { assertNull(Converter.convertArabicToRoman(4000000)); }
}