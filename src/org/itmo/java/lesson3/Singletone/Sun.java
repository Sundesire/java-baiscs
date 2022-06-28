package org.itmo.java.lesson3.Singletone;

public class Sun {
    private static Sun sun;
    private String color;
    private int size;

    private Sun() {

    }

    public static Sun getSun() {
        if (sun == null) {
            sun = new Sun();
        }
        return sun;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public static void setSun(Sun sun) {
        Sun.sun = sun;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
