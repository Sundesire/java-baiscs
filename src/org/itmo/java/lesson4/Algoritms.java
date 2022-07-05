package org.itmo.java.lesson4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Algoritms {
    public static void main(String[] args) {
//        checkOddNumbers();
//        checkDivOnThreeOrFive();
//        checkSumm();
//        checkMax();
//        int[] ints = {2,4,5,9};
//        checkFirstOrLast(ints);
//        checkArrayForNumber(ints);
//        checkMinToMaxArray(ints);
//        inputArray();
//        int[] ints1 = {1,2,3,4};
//        int[] ints2 = {4,2,3,4};
//        int[] ints3 = {1};
//        swapFirstAndLast(ints1);
//        swapFirstAndLast(ints2);
//        swapFirstAndLast(ints3);
        int[] uniqueArray = {1, 2, 3, 1, 2, 4};
        uniqueNumber(uniqueArray);
    }


    //Задание №1
    public static void checkOddNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Задание №2
    public static void checkDivOnThreeOrFive() {
        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Делится на 3 и на 5: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
    }

    //Задание №3
    public static void checkSumm() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a + b == c) {
            System.out.println("result: " + true);
        } else {
            System.out.println("result: " + false);
        }
    }

    //Задание №4
    public static void checkMax() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("result: " + true);
        } else {
            System.out.println("result: " + false);
        }
    }

    //Задание №5
    public static void checkFirstOrLast(int[] array) {
        int lenght = array.length;
        if ((array[0] == 3) || (array[lenght - 1] == 3)) {
            System.out.println("result: " + true);
        } else {
            System.out.println("result: " + false);
        }
    }

    //Задание №6
    public static void checkArrayForNumber(int[] array) {
        int checkArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1 || array[i] == 3) {
                checkArray++;
            }
        }

        if (checkArray != 0) {
            System.out.println("Массив содержит число 1 или 3");
        } else {
            System.out.println("В массиве отсуствует число 1 или 3");
        }
    }

    //ЧАСТЬ 2

    //Задание №1
    public static void checkMinToMaxArray(int[] array) {
        boolean sorted = false;

        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            if (array[i] < array[j] && array[j] < array.length) {
                sorted = true;
            } else {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    //Задание №2
    public static void inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int lenght = scanner.nextInt();
        int[] array = new int[lenght];

        System.out.println("Введите числа массива");
        for (int i = 0; i < lenght; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
    }

    //Задание №3
    public static void swapFirstAndLast(int[] array) {
        System.out.println("Array 1: " + Arrays.toString(array));
        int firstNumber;
        int lastNumber;

        if (array.length > 1) {
            if (array[0] != array[array.length - 1]) {
                firstNumber = array[0];
                lastNumber = array[array.length - 1];
                array[0] = lastNumber;
                array[array.length - 1] = firstNumber;
                System.out.println("Array 2: " + Arrays.toString(array));
            } else {
                System.out.println("Первое и последнее число в массиве - одинаковое!");
            }
        } else {
            System.out.println("Длина масива меньше либо равна 1!");
        }
    }

    //Задание №4
    public static void uniqueNumber(int[] array) {
        int lenght = array.length;
        int[] uniqueNumbers = new int[lenght];
        int uniqueNumbersCounter = 0;
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                uniqueNumbers[uniqueNumbersCounter] = array[i];
                uniqueNumbersCounter++;
            }
        }

        System.out.println("Первое уникальное число массива: " + uniqueNumbers[0]);
    }
}
