package org.itmo.java.lesson5;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {
    public static void main(String[] args) {
        String word = "Anton";
        System.out.println(checkOnPalindrome(word));
    }

    public static Boolean checkOnPalindrome(String word) {
        char[] chars = word.toCharArray();
        int min = 0;
        int max = chars.length;
        int notSame = 0;
        for(char aChar: chars) {
            if (min != max) {
                if (chars[min] == chars[min]) {
                    min++;
                    max--;
                } else {
                    notSame++;
                }
            }
        }
        if (notSame == 0) {
            return true;
        }
     return false;
    }
}
