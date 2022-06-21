package org.itmo.java.lesson2;

public class Calculator {
    public static void main(String[] args) {
        int summ = summ(3,5);
        int extr = extr(4,2);
        int mult = mult(21,3);
        int div = div(48, 12);
        System.out.println("Summ: " + summ + ", extr: " + extr + ", mult: " + mult + ", div: " + div);
    }

    //Summ
    public static int summ(int a, int b) {
        return a + b;
    }

    public static double summ(double a, double b) {
        return a + b;
    }

    public static long summ(long a, long b) {
        return a + b;
    }

    //Extraction
    public static int extr (int a, int b) {
        return a - b;
    }

    public static double extr (double a, double b) {
        return a - b;
    }

    public static long extr (long a, long b) {
        return a - b;
    }

    //Multiply
    public static int mult(int a, int b) {
        return a * b;
    }

    public static double mult(double a, double b) {
        return a * b;
    }

    public static long mult(long a, long b) {
        return a * b;
    }

    //Divide
    public static int div(int a, int b) {
        return a / b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
    public static long div(long a, long b) {
        return a / b;
    }
}
