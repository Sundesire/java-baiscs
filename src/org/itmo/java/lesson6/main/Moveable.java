package org.itmo.java.lesson6.main;

public interface Moveable {
    //Используется когда объеку класса задаётся поведение.
    // Описание методов для применения.
    public static final String NAME = "Name";
    void printInfo();
    String Name();

    default void someMethod() {
        System.out.println("someMethod");
    }

    public static void staticMethod() {
        //logic
    }
}
