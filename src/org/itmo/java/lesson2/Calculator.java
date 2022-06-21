package org.itmo.java.lesson2;

public class Calculator {
    public static void main(String[] args) {
        int summ = summ(3,5);
        int extr = extr(4,2);
        double mult = mult(21,3.4d);
        long div = div(412318L, 12124);
        System.out.println("Summ: " + summ + ", extr: " + extr + ", mult: " + mult + ", div: " + div);
        Human human1 = new Human();
        System.out.println("Human 1: " + human1.getName() + " " + human1.getAge() + " years old.");
        Human human2 = new Human("Alex");
        System.out.println("Human 2: " + human2.getName() + " " + human2.getAge() + " years old.");
        human2.setAge(33);
        System.out.println("Human 2: " + human2.getName() + " " + human2.getAge() + " years old.");
        Human human3 = new Human("James",21);
        System.out.println("Human 3: " + human3.getName() + " " + human3.getAge() + " years old.");

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
