package org.example;


public class Converter {

    public static String convertArabicToRoman (int number) {
        String result = "";
        if (number >= 4000000) {
            return null;
        }
        else {
            int[] values = {3999999, 1000000, 500000, 150000, 100000, 50000, 10000, 9999, 5000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] numerals = {"mmmcmxcvMvCMXCIX", "m", "d", "cl", "c", "l", "x", "vMvCMXCIX", "v", "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            for (int i = 0; i < values.length; i++) {
                while (number >= values[i]) {
                    result += numerals[i];
                    number -= values[i];
                }
            }
        }

        return result;
    }
}
