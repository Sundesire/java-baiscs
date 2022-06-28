package org.itmo.java.lesson3.Singletone;

public class Singletone {
    private static Singletone instanse;

    private Singletone() {

    }

    public static Singletone getInstance() {
        if (instanse == null) {
            instanse = new Singletone();
        }
        return instanse;
    }
}
