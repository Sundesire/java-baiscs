package org.itmo.java.lesson3;

import org.itmo.java.lesson2.Color;

public class Configurator {

    private Color color;
    private String name;
    private Integer weight;

    public Configurator(Integer weight) {
        this.color = Color.UNKNOWN;
        this.name = "NoName";
        this.weight = weight;
    }

    public Configurator(Color color, Integer weight) {
        this.color = color;
        this.name = "NoName";
        this.weight = weight;
    }

    public Configurator() {
        this.color = Color.UNKNOWN;
        this.name = "NoName";
        this.weight = 0;
    }

    public String printInformation() {
        return "Цвет: " + color + ", имя: " + name + ", вес: " + weight + " кг.";
    }

}

class ConfiguratorMain {
    public static void main(String[] args) {
        Configurator conf1 = new Configurator();
        Configurator conf2 = new Configurator(Color.BLACK, 35);
        System.out.println(conf1.printInformation());
        System.out.println(conf2.printInformation());
    }
}
