package org.itmo.java.lesson6.main;

public class Plane extends Transport{
    public Plane(Integer weight, Integer seats, Boolean isFlying) {
        super(weight, seats, isFlying);
    }

    @Override
    void abstractMethod() {
        System.out.println("abstractMethod");
    }

    @Override
    public void printInfo() {

    }

    @Override
    public String Name() {
        return null;
    }
}
