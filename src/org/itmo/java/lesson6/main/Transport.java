package org.itmo.java.lesson6.main;

public abstract class Transport implements Moveable {
    private Integer weight;
    private Integer seats;
    private Boolean isFlying;

    public Transport(Integer weight, Integer seats, Boolean isFlying) {
        this.weight = weight;
        this.seats = seats;
        this.isFlying = isFlying;
    }

    abstract void abstractMethod();

    public void info() {
        //logic
    }
}
