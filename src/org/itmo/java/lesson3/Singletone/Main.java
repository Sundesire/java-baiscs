package org.itmo.java.lesson3.Singletone;

public class Main {
    public static void main(String[] args) {
        Sun sun = Sun.getSun();
        sun.setSize(123);
        sun.setColor("white");

        System.out.println(sun);

        Sun sun2 = Sun.getSun();
        sun2.setSize(77);
        sun2.setColor("yellow");
        System.out.println(sun2);
    }
}
