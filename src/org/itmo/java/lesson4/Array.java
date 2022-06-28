package org.itmo.java.lesson4;

import org.itmo.java.lesson2.Human;
import org.itmo.java.lesson2.Color;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        intArray[0] = 0;
        intArray[1] = 10;
        intArray[2] = 20;
        intArray[3] = 30;
        intArray[4] = 40;
        intArray[5] = 50;
        intArray[6] = 60;

//        System.out.println(Arrays.toString(intArray));

        String[] strings = new String[5];
//        System.out.println(Arrays.toString(strings));


        long[] longs = new long[] {123L, 321L,333L};
//        System.out.println(Arrays.toString(longs));

        Human[] humans = new Human[1];
        humans[0] = new Human("Alex",23,true, Color.BLACK);
//        System.out.println(humans[0].getName());

        for (int i = 0; i < longs.length; i++) {
//            System.out.println(longs[i]);
        }

        for (Human human : humans) {
//            System.out.println(human.getName());
        }

        int x = 0;

//        do {
//            //logic
////            System.out.println(++x);
//        } while (x != 10);

//        while (x != 5) {
//            System.out.println(x++);
//            if(x == 3) {
//                break;
//            }
//
//            if (x == 2) {
//                continue;
//            }
//        }
//        varargMethod("qwerty", "qwe", "asdasf");

        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.binarySearch(intArray, 20));
        System.out.println(Arrays.toString(intArray));

    }

    public static void varargMethod(String... line) {
        System.out.println(Arrays.toString(line));
    }
}
