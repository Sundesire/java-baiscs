package org.itmo.java.lesson6.main;

public class Man implements Moveable{
    @Override
    public void printInfo() {
        System.out.println(Name());
    }

    @Override
    public String Name() {
        return "Alex";
    }
}
